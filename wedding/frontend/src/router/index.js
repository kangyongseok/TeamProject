import Vue from 'vue'
import Router from 'vue-router'
import WeddingTemplate from '@/components/WeddingTemplate'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'WeddingTemplate',
      component: WeddingTemplate
    }
  ]
})
