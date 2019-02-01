<template>
    <div class="header-area">
        <WeddingHaeder />
    </div>
</template>

<script>
import WeddingHaeder from './WeddingHeader.vue'
export default {
    components: {WeddingHaeder}
}
</script>

<style>
    .header-area {
        display:flex;
        height:80px;
        justify-content: center;
    }
</style>
