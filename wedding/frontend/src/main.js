// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store/store'
import axios from 'axios'
import Icon from 'vue-awesome/components/Icon'

import 'vue-awesome/icons/star'
import 'vue-awesome/icons/heart'
import 'vue-awesome/icons/spinner'


Vue.component('v-icon', Icon)
Vue.config.productionTip = false
Vue.prototype.$http = axios

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
