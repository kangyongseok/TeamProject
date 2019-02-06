<template>
    <div class="header">
        <div class="header-area">
            <h1 class="logo">
                <router-link to="/">{{ title }}</router-link>
            </h1>
            <div class="menu-area">
                <ul>
                    <li 
                    v-for="(menu, index) in menus" 
                    v-bind:key="index">
                        {{menu}}
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
    name: 'Header',
    computed: mapState([
        'title',
        'menus'
    ])
}
</script>

<style>
.header {
    width:100%;
    background: white;
    margin:0;
    padding:0;
}

.header-area {
    width:60%;
    height:80px;
    margin:0 auto;
    overflow: auto;
    line-height: 80px;
}

.header-area .logo {
    float:left;
}

.header-area .logo a {
    color:#00A591;
    text-decoration: none;
}

.header-area .menu-area {
    height:100%;
    float:right;
}

.header-area .menu-area ul {
    height:100%;
}

.header-area .menu-area li {
    height:100%;
    line-height: 80px;
    float:left;
    list-style: none;
    padding:0 20px;
}
</style>
