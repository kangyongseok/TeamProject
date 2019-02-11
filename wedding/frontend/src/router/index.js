import Vue from 'vue'
import Router from 'vue-router'
import WeddingMain from '@/components/WeddingMain'
import WeddingReview from '@/components/WeddingReview'
import WeddingReviewWrite from '@/components/WeddingReviewWrite'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'WeddingMain',
      component: WeddingMain
    },
    {
      path: '/review/:id',
      name: 'WeddingReview',
      component: WeddingReview
    },
    {
      path: '/write/',
      name: 'WeddingReviewWrite',
      component: WeddingReviewWrite
    }
  ]
})
