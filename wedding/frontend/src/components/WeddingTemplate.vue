<template>
  <div>
    <div class="header-area">
      <WeddingHaeder />
    </div>
    <div class="banner-area">
      <WeddingBanner />
    </div>
    <div class="contents-area">
      <WeddingContents />
    </div>
  </div>
</template>

<script>
import WeddingHaeder from './WeddingHeader.vue'
import WeddingBanner from './WeddingBanner.vue'
import WeddingContents from './WeddingContents.vue'

export default {
  name: 'WeddingTemplate',
  components: {WeddingHaeder, WeddingBanner, WeddingContents},
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style lang="scss" scoped>
  .header-area {
    display:flex;
    height:80px;
    justify-content: center;
  }
  .banner-area {
    width:100%;
    background: #eeeeee;
    height:400px;
  }
</style>
