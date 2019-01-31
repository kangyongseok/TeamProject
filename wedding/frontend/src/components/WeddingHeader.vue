<template>
    <div class="header-contents">
        <h1 class="logo"><a href="#">TOYWEDDING</a></h1>
        <div class="util">
            <ul>
                <li><a href="#">MY</a></li>
                <li><a href="#">알림</a>
                    <span class="is-message" v-if="isMessage"></span>
                    <dl>
                        <dt>알림 전체보기 ></dt>
                        <dd>
                            <span class="scrap">나의 스크랩</span>
                            <p><b>OO웨딩홀</b>에 1개의 리뷰가 등록되었습니다.</p>
                        </dd>
                        <dd>
                            <span class="review">나의 리뷰</span>
                            <p><b>OO웨딩홀</b>에 1개의 리뷰가 등록되었습니다.</p>
                        </dd>
                    </dl>
                </li>
                <li><a href="#">리뷰쓰기</a></li>
                <li><a href="#">search</a></li>
            </ul>
        </div>
    </div>
</template>

<script>
export default {
  data () {
    return {
      isMessage: true
    }
  }
}
</script>

<style lang="scss" scope>
    $mainColor: #00A591;

    .header-contents {
        width:60%;
        min-width:700px;
        display: flex;
        align-items: stretch;
        .logo {
            display: flex;
            flex:2;
            align-items: stretch;
            font-size:1.3rem;
            a {
                color:$mainColor;
                text-decoration: none;
                display: flex;
                align-items: center;
            }
        }
        .util {
            flex:1;
            display: flex;
            align-items: stretch;
            margin-left:auto;
            ul {
                display: flex;
                flex:1;
                justify-content: space-between;
                align-items: stretch;
            }
            li {
                display: flex;
                align-items: stretch;
                flex:auto;
                position: relative;
                a {
                    color:#333333;
                    text-decoration:none;
                    font-weight:600;
                }
                .is-message {
                    background: red;
                    width:5px;
                    height:5px;
                    border-radius: 5px;
                    position: absolute;
                    top:40%;
                    right:20%;
                }
                dl {
                    position:absolute;
                    border:1px solid #cccccc;
                    background: #ffffff;
                    width:200px;
                    border-radius: 3px;
                    z-index: 99;
                    top:4rem;
                    left:0;
                    dt {
                        border-bottom:1px solid #cccccc;
                        padding:0.5rem 1rem;
                    }
                    dd {
                        padding:0 1rem;
                        margin:1rem 0;
                        span {
                            font-weight:600;
                            font-size:0.8rem;
                        }
                        .scrap {
                            color:rgb(243, 170, 13);
                        }
                        .review {
                            color:rgb(88, 165, 0);
                        }
                    }
                }
            }
            a {
                flex:1;
                display: flex;
                align-items: center;
                justify-content: center;
            }
        }
    }
</style>
