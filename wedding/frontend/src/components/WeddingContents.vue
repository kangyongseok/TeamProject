<template>
    <div class="contents">
        <p class="resion">내가 설정한 지역</p>
        <div class="contents-top">
            <h3><b>서초구</b> 총 <span>29</span>건 결과입니다.</h3>
            <div class="align">
                <button type="button">별점순으로 보기</button>
                <button type="button">리뷰순으로 보기</button>
            </div>
        </div>
        <div class="card-area">
            <WeddingCard v-for="(card, key, index) in 6" />
        </div>
    </div>
</template>

<script>
import WeddingCard from './WeddingCard.vue'
export default {
    components: {WeddingCard}
}
</script>

<style lang="scss" scope>
    $mainColor: #00A591;
    .contents {
        width:60%;
        margin:3rem auto;
        .resion {
            font-size:0.8rem;
            font-weight:600;
            color:$mainColor;
            margin-bottom:0.5rem;
        }
    }
    .contents-top {
        display:flex;
        h3 {
            margin-right:auto;
            font-weight: 500;
            font-size:1.5rem;
        }
        button {
            border:none;
            background: none;
            cursor: pointer;
            font-size:1rem;
        }
        span {
            color:$mainColor;
        }
    }
    .card-area {
        width:100%;
        margin-top:2rem;
        display: flex;
        flex-wrap: wrap;
    }
</style>
