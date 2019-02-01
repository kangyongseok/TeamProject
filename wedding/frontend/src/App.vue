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
  font-size:100%;
}

body {
  height:100%;
  background: #f1f1f1;
}

ul {
  list-style: none;
}
</style>
