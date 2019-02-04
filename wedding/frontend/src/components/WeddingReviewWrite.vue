<template>
    <div>
        <div class="header-area">
            <WeddingHaeder />
        </div>
        <div class="banner-area"></div>
        <div class="review-form">
            <form action="">
                <p class="form-title">웨딩홀을 선택해 주세요</p>
                <select name="" id="">
                    <option value="">케이터틀웨딩홀</option>
                    <option value="">강남웨딩홀</option>
                    <option value="">인천웨딩홀</option>
                </select>

                <p class="form-title">평점을 매겨주세요</p>
                맛 <rate :length="5" v-model="myRate" />{{myRate}}<br/>
                교통 ★★★★★<br/>
                서비스 ★★★★★<br/>
                웨딩홀 ★★★★★<br/>
                주차 ★★★★★

                <p class="form-title">제목</p>
                <input type="text" placeholder="제목을 입력해 주세요" v-model="title">

                <p class="form-title">내용(200자 이상 작성)</p>
                <vue-editor v-model="content"></vue-editor>
                <div class="write-button">
                    <input class="input-write" type="submit" value="작성완료" v-on:click.prevent="submitted">
                </div>
                <div v-if="isSubmitted">
                    title: {{title}}<br/>
                    <div v-html="content"></div>
                </div>
            </form>
        </div>
    </div>
</template>

<script>
import WeddingHaeder from './WeddingHeader.vue'
import WeddingBanner from './WeddingBanner.vue'
// import YimoVueEditor from 'yimo-vue-editor'
import { VueEditor } from 'vue2-editor'
// https://www.npmjs.com/package/vue2-editor


export default {
    components: {WeddingHaeder, WeddingBanner, VueEditor},
    data() {
        return {
            isSubmitted: false,
            title:'',
            content: ''  ,
            myRate: 0
        }
    },
    methods: {
        submitted() {
            this.isSubmitted = true;
        }
    }
}

</script>

<style lang="scss">
$mainColor: #00A591;
.header-area {
        display:flex;
        height:80px;
        justify-content: center;
        background: white;
    }
.banner-area {
    width:100%;
    background: url('https://peopledotcom.files.wordpress.com/2018/11/ct-tamburello-3.jpg') no-repeat 50% 50%;
    height:400px;
  }
  .review-form {
      background: white;
      width:60%;
      margin:0 auto;
      padding:2rem 2rem 2rem 2rem;
      position: relative;
      top:-10rem;
      
  }
  .form-title {
      font-size:1.2rem;
      font-weight:600;
      margin-bottom:1rem;
      margin-top:2rem;
  }
  .write-button {
      text-align: center;
      .input-write {
          border:1px solid $mainColor;
          padding:0.6rem 2rem;
          margin-top:2rem;
          background: none;
          color:$mainColor;
          cursor: pointer;
          &:hover {
              background: $mainColor;
              color:white;
          }
      }
  }
</style>
