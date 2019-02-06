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

<style>
@import url('https://fonts.googleapis.com/css?family=Noto+Sans+KR|Roboto');
#app {
  font-family: 'Roboto', 'Noto Sans KR', sans-serif;
}
* {
  margin:0;
  padding:0;
  box-sizing: border-box;
}
body {
  height:100%;
  background: #f4f4f4;
}

.btn {
  border:none;
  background: none;
  cursor: pointer;
  outline: none;
}
</style>
