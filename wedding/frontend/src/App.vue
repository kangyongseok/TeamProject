<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style lang="scss">
* {
  margin:0;
  padding:0;
  box-sizing: border-box;
}

html,
body {
  width:100%;
  height:100%;
  font-size:100%;
}

ul {
  list-style: none;
}
</style>
