<template>
    <div class="contents">
        <p class="resion">내가 설정한 지역</p>
        <div class="contents-top">
            <h3><b>서초구</b> 총 <span>29</span>건 결과입니다.</h3>
            <div class="align">
                <button type="button" v-on:click="setActive('star')" :class="{active:isActive('star')}">별점순으로 보기</button>
                <button type="button" v-on:click="setActive('review')" :class="{active:isActive('review')}">리뷰순으로 보기</button>
            </div>
        </div>
        <div class="card-area">
            <div class="hall-card" v-for="(card, index) in hallInfo">
                <WeddingCard 
                    :title="hallInfo[index].name"
                    :addr="hallInfo[index].addr"
                    :star="hallInfo[index].star"
                    :img="hallInfo[index].img"
                    :like="hallInfo[index].like"
                /> 
            </div>
        </div>
    </div>
</template>

<script>
import WeddingCard from './WeddingCard.vue'
export default {
    components: {WeddingCard},
    data() {
        return {
            activeItem: 'star',
            hallInfo: [
                { name:"케이터틀", addr:"서울 영등포구", star:5, img:"https://user-images.githubusercontent.com/32993709/52098561-d6694200-2612-11e9-9a89-4f28f05d6aea.jpg", like:false },
                { name:"제이오스티엘", addr:"인천 남구", star:3, img:"https://user-images.githubusercontent.com/32993709/52098561-d6694200-2612-11e9-9a89-4f28f05d6aea.jpg", like:false },
                { name:"켄싱턴호텔 여의도", addr:"서울 구로구", star:2, img:"https://user-images.githubusercontent.com/32993709/52098561-d6694200-2612-11e9-9a89-4f28f05d6aea.jpg", like:true },
                { name:"그랜드오스티엄", addr:"서울 중구", star:0, img:"https://user-images.githubusercontent.com/32993709/52098561-d6694200-2612-11e9-9a89-4f28f05d6aea.jpg", like:false },
                { name:"루이비스 웨딩홀", addr:"서울 동작구", star:1, img:"https://user-images.githubusercontent.com/32993709/52098561-d6694200-2612-11e9-9a89-4f28f05d6aea.jpg", like:false },
                { name:"루이비스컨벤션 송파점", addr:"경기 수원시", star:4, img:"https://user-images.githubusercontent.com/32993709/52098561-d6694200-2612-11e9-9a89-4f28f05d6aea.jpg", like:false },
            ]
        }
    },
    methods: {
        isActive : function(menuItem)  {
            return this.activeItem === menuItem
        },
        setActive : function(menuItem) {
            this.activeItem = menuItem
        },
        infinit() {
            let that = this
            let pushInfo = { name:"케이터틀", addr:"서울 영등포구", star:5, img:"https://user-images.githubusercontent.com/32993709/52098561-d6694200-2612-11e9-9a89-4f28f05d6aea.jpg", like:false }
            window.onscroll = function(ev) {
                if ((window.innerHeight + window.scrollY) >= document.body.offsetHeight) {
                    setTimeout(() => {
                        that.hallInfo.push(pushInfo)
                    },2000)
                }
            };
        }
    },
    created() {
        this.infinit()
    }
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
            outline: none;
        }
        span {
            color:$mainColor;
        }
        .active {
            color:$mainColor;
            font-weight:600;
            border-bottom:2px solid $mainColor;
            padding-bottom:0.5rem;
            
        }
    }
    .card-area {
        width:100%;
        margin-top:2rem;
        display: flex;
        flex-wrap: wrap;
        .hall-card {
        width:30%;
        margin:auto;
        margin-bottom:2rem;
        box-shadow: 3px 3px 10px 1px rgba(0, 0, 0, 0.3);
        border-radius: 5px;
        background: white;
        }
    }
</style>
