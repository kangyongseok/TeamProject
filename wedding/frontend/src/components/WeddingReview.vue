<template>
  <div>
    <Header />
    <div class="review-contents">
      <div class="box hall-info">
        <div class="info-txt">
          <h2>{{hallInfo.name}}</h2>
          <p class="adr">{{hallInfo.address}}</p>
          <p class="rating-total"></p>
          <span class="tag" v-for="(tag, index) in hallInfo.tag" v-bind:key="index">{{tag}}</span>
        </div>
        <div class="info-img">
          <img :src="hallInfo.img" alt="">
        </div>
      </div>
      <div class="box ratings">
        <div class="rating">
            <h3>맛</h3>
            <p>4.0</p>
            <p>★</p>
          </div>
          <div class="rating">
            <h3>교통</h3>
            <p>4.0</p>
            <p>★</p>
          </div>
          <div class="rating">
            <h3>서비스</h3>
            <p>4.0</p>
            <p>★</p>
          </div>
          <div class="rating">
            <h3>웨딩홀</h3>
            <p>4.0</p>
            <p>★</p>
          </div>
          <div class="rating">
            <h3>주차</h3>
            <p>4.0</p>
            <p>★</p>
          </div>
      </div>
      <div class="box reviews" v-for="(review, index) in hallInfo.reviews" v-bind:key="index">
        <h3 class="review-title">
          "{{review.title}}"
        </h3>
        <p>총점<b>{{review.totalRating}}</b> {{review.date}}</p>
        <p class="review-txt">
          {{review.txt}}
        </p>
      </div>
    </div>
  </div>
</template>

<script>
import Header from '@/components/common/Header'
import { mapGetters } from 'vuex'

export default {
  data() {
    return {
      hallInfo: ''
    }
  },
  components: {
    Header
  },
  created() {
    this.getFilter()
  },
  methods: {
    getFilter: function() {
      this.hallInfo = this.getData[this.$route.params.id]
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
  .review-contents {
    width:60%;
    margin:0 auto;
  }
  .box {
    background: white;
    margin:2rem 0;
  }
  .ratings {
    display: flex;
  }
  .ratings .rating {
    flex:1;
    text-align: center;
    padding:2rem;
  }

  .hall-info {
    display: flex;
  }

  .info-txt {
    padding:2rem;
    flex: 1;
  }

  .info-img {
    flex: 2;
  }

  .info-img img {
    width:100%;
    
  }

  .reviews {
    padding:2rem;
  }
  .review-txt {
    border-top:1px solid #cccccc;
    margin-top:1rem;
    padding-top:1rem;
  }
</style>
