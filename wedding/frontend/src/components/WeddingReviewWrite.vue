<template>
  <div>
    <Header />
    <div>

    </div>
    <div class="contents-write">
      <p class="rating-num">{{ratings[0]}}</p>
      <p>
        <star-rating 
          v-bind:star-size="15" 
          v-bind:increment="0.5" 
          v-bind:show-rating="false"
          v-bind:fixed-points="0.0"
          @rating-selected ="setRating($event, 0)"
        />
      </p>

      <p class="rating-num">{{ratings[1]}}</p>
      <p>
        <star-rating 
          v-bind:star-size="15" 
          v-bind:increment="0.5" 
          v-bind:show-rating="false"
          v-bind:fixed-points="0.0"
          @rating-selected ="setRating($event, 1)"
        />
      </p>

      <p class="rating-num">{{ratings[2]}}</p>
      <p>
        <star-rating 
          v-bind:star-size="15" 
          v-bind:increment="0.5" 
          v-bind:show-rating="false"
          v-bind:fixed-points="0.0"
          @rating-selected ="setRating($event, 2)"
        />
      </p>

      <p class="rating-num">{{ratings[3]}}</p>
      <p>
        <star-rating 
          v-bind:star-size="15" 
          v-bind:increment="0.5" 
          v-bind:show-rating="false"
          v-bind:fixed-points="0.0"
          @rating-selected ="setRating($event, 3)"
        />
      </p>

      <p class="rating-num">{{ratings[4]}}</p>
      <p>
        <star-rating 
          v-bind:star-size="15" 
          v-bind:increment="0.5" 
          v-bind:show-rating="false"
          v-bind:fixed-points="0.0"
          @rating-selected ="setRating($event, 4)"
        />
      </p>
    </div>
  </div>
</template>

<script>
import Header from '@/components/common/Header'
import StarRating from 'vue-star-rating'

export default {
  data() {
    return {
      ratings: [0, 0, 0, 0, 0]
    }
  },
  components: {
    Header,
    StarRating
  },
  methods: {
    setRating: function(event, a){  
      // this.ratings.splice(a, 0, event)
      this.ratings.splice(a, 1, event)
    }
  }
}
</script>

<style>
.contents-write {
  background: white;
  width:60%;
  margin:0 auto;
  padding:2rem;
}
</style>
