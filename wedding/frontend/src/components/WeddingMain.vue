<template>
  <div class="wrap">
    <Header />
    <WeddingBanner />
    <WeddingContents />
  </div>
</template>

<script>
import Header from '@/components/common/Header'
import WeddingBanner from '@/components/WeddingBanner'
import WeddingContents from '@/components/WeddingContents'

import { mapState, mapMutations, mapActions } from 'vuex'
export default {
  name: 'WeddingMain',
  data() {
    return {
      
    }
  },
  components: {
    Header,
    WeddingBanner,
    WeddingContents
  },
  computed: {

  },
  methods: {
    
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>

</style>
