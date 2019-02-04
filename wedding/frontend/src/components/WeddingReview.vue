<template>
    <div>
        <div class="header-area">
            <WeddingHaeder />
        </div>
        <div class="review-list-page hall-info">
            <div class="info-txt">
                <h4>케이터틀{{$route.params.id}}</h4>
                <div class="addr">서울시 마포구</div>
                <div class="total-num"></div>
                <div class="tag"></div>
                <div class="like"></div>
            </div>
            <div class="slide-img">
                <img src="../assets/b1.jpg" alt="">
            </div>
        </div>
        <div class="review-list-page review-stars">
            <div class="star-select">
                <p class="star-title">맛</p>
                <p class="star-num">4</p>
                <p class="star-icon">★★★★★</p>
            </div>
            <div class="star-select">
                <p class="star-title">교통</p>
                <p class="star-num">4</p>
                <p class="star-icon">★★★★★</p>
            </div>
            <div class="star-select">
                <p class="star-title">서비스</p>
                <p class="star-num">4</p>
                <p class="star-icon">★★★★★</p>
            </div>
            <div class="star-select">
                <p class="star-title">웨딩홀</p>
                <p class="star-num">4</p>
                <p class="star-icon">★★★★★</p>
            </div>
            <div class="star-select">
                <p class="star-title">주차</p>
                <p class="star-num">4</p>
                <p class="star-icon">★★★★★</p>
            </div>
        </div>
        <div class="review-list-page detail-review">
            <h4>"별로인줄알았는데 어른들은 만족!"</h4>
            <span>총점 4</span>
            <span>2019.01.23</span>
            <p>
                Lorem, ipsum dolor sit amet consectetur adipisicing elit. Eum quibusdam soluta optio laudantium laboriosam ducimus animi provident repudiandae. Dignissimos voluptates hic totam nisi dolores itaque aliquid molestias voluptatibus sit illum.
            </p>
        </div>
    </div>
</template>

<script>
import WeddingHaeder from './WeddingHeader.vue'
export default {
    components: {WeddingHaeder}
}
</script>

<style lang="scss">
    $review-contents-width: 60%;
    .header-area {
        display:flex;
        height:80px;
        justify-content: center;
        background: white;
    }
    .review-list-page {
        width:$review-contents-width;
        margin:2rem auto;
        background: white;
    }
    .hall-info {
        display: flex;
        height:25rem;
        overflow: hidden;
        .info-txt {
            padding:2rem;
            flex:1;
        }
        h4 {
            font-size:2rem;
        }
        .addr {
            color:#666666;
            margin: 1.2rem 0;
        }
        .slide-img {
            flex:2;
            img {
                width:100%;
            }
        }
    }
    .review-stars {
        display: flex;
        padding:2rem;
        text-align: center;
        .star-select {
            flex:1;
        }
        .star-num {
            font-size:2rem;
            margin:1rem 0;
        }
    }
    .detail-review {
        padding:2rem;
        span {
            font-size:0.8rem;
            color:#666666;
        }
        p {
            border-top:1px solid #cccccc;
            margin-top:1rem;
            padding-top:1rem;
        }
    }
</style>
