import Vue from 'vue'
import Router from 'vue-router'
import WeddingTemplate from '@/components/WeddingTemplate'
import WeddingReview from '@/components/WeddingReview'
import WeddingReviewWrite from '@/components/WeddingReviewWrite'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'WeddingTemplate',
      component: WeddingTemplate
    },
    {
      path: '/review',
      name: 'WeddingReview',
      component: WeddingReview
    },
    {
      path: '/write',
      name: 'WeddingReviewWrite',
      component: WeddingReviewWrite
    }
  ]
})
