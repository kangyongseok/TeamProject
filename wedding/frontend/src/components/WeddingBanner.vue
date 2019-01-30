<template>
    <div class="banner-contents">
        <img src="../assets/b1.jpg" alt="">
        <div class="banner-txt">
            <p>당신의 선택,<br/>더이상 신경쓰지마세요</p>
            <button>리뷰작성하고 전체 열람하기</button>
        </div>
    </div>
</template>

<script>
export default {
}
</script>

<style lang="scss" scope>
    $mainColor: #00A591;
    .banner-contents {
        position: relative;
        overflow: hidden;
        height:100%;
        display: flex;
        align-items: center;
        justify-content: center;
        img {
            width:100%;
            display: block;
            position: absolute;
            top:-100%;
        }
        .banner-txt {
            position: absolute;
            padding:2rem 5rem;
            text-align: center;
            color:white;
            background: rgba(0, 0, 0, 0.3);
            font-size:2rem;
            button {
                border:1px solid #ffffff;
                background: none;
                color:white;
                padding:1rem;
                margin-top:1rem;
                cursor: pointer;
                &:hover {
                    background: $mainColor;
                }
            }
        }
    }
</style>
