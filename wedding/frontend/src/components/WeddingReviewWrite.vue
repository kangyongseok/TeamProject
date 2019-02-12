<template>
  <div>
    <Header />
    <div class="write-banner">
      <img src="https://hhp-blog.s3.amazonaws.com/2017/10/iStock-847069454.jpg" alt="">
    </div>
    <div class="contents-write">
      <div>
        <h3>웨딩홀을 선택해 주세요</h3>
        <select name="" id="">
          <option v-for="(nameData, index) in names" :key="index" value="nameData">{{nameData}}</option>
        </select>
      </div>
      <div>
        <h3>평점을 매겨주세요</h3>
        <div class="rating-check" v-for="(rating, index) in ratings" :key="index">
          <h3>{{ratingName[index]}}</h3>
          <p>
            <star-rating 
              v-bind:star-size="40" 
              v-bind:increment="0.5" 
              v-bind:fixed-points="0.0"
              v-bind:rtl="false"
              border-color="#cccccc"
              v-bind:border-width="1"
              inactive-color="#eeeeee"
              active-color="#00A591"
              v-bind:rounded-corners="true"
              @rating-selected ="setRating($event, index)"
            />
          </p>
        </div>
      </div>
      <div>
        <form action="">
          <h3>제목</h3>
          <input type="text">
          <h3>내용(178자 이상 작성)</h3>
          <vue-editor></vue-editor>
          <input class="btn write-btn" type="submit" value="작성완료">
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import Header from '@/components/common/Header'
import StarRating from 'vue-star-rating'
import { VueEditor } from 'vue2-editor'
import { mapGetters } from 'vuex'

export default {
  data() {
    return {
      ratingName: ['맛', '교통', '서비스', '웨딩홀', '주차'],
      ratings: [0, 0, 0, 0, 0],
      names: ''
    }
  },
  components: {
    Header,
    StarRating,
    VueEditor
  },
  created() {
    this.datas()
  },
  methods: {
    setRating: function(event, a){  
      // this.ratings.splice(a, 0, event)
      this.ratings.splice(a, 1, event)
    },
    datas: function() {
      this.names = this.getData.map(d => d.name)
    }
  },
   computed: {
    ...mapGetters([
      'getData'
    ])
  }
}
</script>

<style>

.write-banner {
  width:100%;
  height:400px;
  overflow: hidden;
}
.write-banner img {
  width:100%;
  margin-top:-50%;
}
.contents-write {
  background: white;
  width:60%;
  margin:0 auto;
  padding:2rem;
  position: absolute;
  top:50%;
  left:50%;
  transform:translate(-50%, -20%);
}
.write-btn {
  color:#00A591;
  border:1px solid #00A591;
  width:20%;
  padding:0.5rem;
  font-size:1.2rem;
  margin:2rem auto;
  display: block;
}
.write-btn:hover {
  background: #00A591;
  color:white;
}
</style>
