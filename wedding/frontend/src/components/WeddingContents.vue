<template>
  <div class="main-contents">
    <div class="content-top">
      <h1 class="contents-title">Wedding Hall List</h1>
      <div class="order-btn">
        <button class="btn" @click="" >별점순으로 보기</button>
        <button class="btn">리뷰순으로 보기</button>
      </div>
    </div>
    <div class="card-area">
      <div class="card" v-for="(info, index) in getData" v-bind:key="index">
      <div class="hall-img">
        <img :src="info.img" alt="">
      </div>
      <div class="hall-text">
        <h3><router-link :to="{path: '/review/' + info.id}">{{info.name}}</router-link></h3>
        <p class="address">
          {{info.address}}
        </p>
      </div>
      <div class="icon-area">
        <div class="stars">
          <v-icon name="star" v-for="(star, index) in info.star" v-bind:key="index"/>
        </div>
        <div class="like">
          <button class="btn" @click="hallLike(index)" :class="{ likeOn:info.like }"> 
            <v-icon name="heart" />
          </button>
        </div>
      </div>
    </div>
    </div>
    <div class="loding" v-if="loding">
      <v-icon name="spinner" spin scale="2"/>
    </div>
  </div> 
</template>

<script>
// https://justineo.github.io/vue-awesome/demo/
import { mapActions, mapGetters, mapMutations } from 'vuex'
export default {
  data() {
    return {
      loding: false
    }
  },
  created() {
    this.infinit()
  },
  methods: {
    ...mapActions([
      
    ]),
    hallLike(index) {
      this.$store.commit('hallLike', index)
    },
    infinit: function() {
      window.onscroll = function(ev) {
        if ((window.innerHeight + window.scrollY) >= document.body.offsetHeight) {
          console.log(1)
        }
      }; 
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
  .main-contents {
    width:60%;
    margin:2rem auto;
  }
  .main-contents .card {
    margin-top:2rem;
    background: white;
    width:32%;
  }
  .main-contents .card img {
    width:100%;
  }
  .hall-img {
    height:200px;
    overflow: hidden;
    background: #333333;
  }
  .hall-text {
    padding:1rem;
  }
  .hall-text .address {
    margin:1rem 0; 
  }

  .card-area {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
  }

  .card {
    display: flex;
    flex-direction: column;
    box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.3);
  }

  .icon-area {
    overflow: auto;
    padding:1rem;
    border-top:1px solid #cccccc;
    margin-top:auto;
  }
  .icon-area .stars {
    float:left;
  }
  .icon-area .like {
    float:right;
  }
  .icon-area .like .btn {
    color:#cccccc;
  }

  .content-top {
    overflow: auto;
    position: relative;
  }
  .contents-title {
    float: left;
  }
  .order-btn {
    float: right;
    height:100%;
    position: absolute;
    right:0;
    bottom:0;
  }
  .order-btn .btn {
    font-size:1rem;
    margin-left:1rem;
    height:100%;
  }

  .loding {
    clear: both;
    text-align: center;
    margin:2rem 0;
    color:#cccccc;
  }

  .icon-area .like .likeOn {
    color:red;
  }
</style>
