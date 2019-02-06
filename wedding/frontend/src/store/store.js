import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const state = {
    title: 'TOYWEDDING',
    menus: [
        'MY',
        '알림',
        '리뷰쓰기',
        'search'
    ],
    data: [
        {
            id:0,
            name:"웨딩여율리",
            address: "서울시 영등포구 국제금융로 6길 26 5층",
            tag: ["#분리", "#서울웨딩", "#뷔페"],
            url: "http://www.yyrwed.com/",
            callnumber: "02-6277-0777",
            star:5,
            like: false,
            img: "http://www.yyrwed.com/attachList/upload/hall/c20150510170430587/p20150510170616323/img20151006115720953.jpg",
            reviews: [
                {
                    title: "별로인줄알았는데 어른들은 만족..",
                    totalRating: 3,
                    date: "2019.01.23",
                    txt: "좋았어요~"
                },
                {
                    title: "무난하게 식 마쳤습니다.",
                    totalRating: 4,
                    date: "2018.07.10",
                    txt: "모든 부분이 무난했습니다. 진행 도와주신분들 모두 감사합니다."
                }
            ]
        },
        {
            id:1,
            name:"제이오스티엘",
            address: "서울시 구로구 경인로 565(구로동, 삼영빌딩) 2층 제이오스티엘",
            tag: ["#분리", "#서울웨딩", "#뷔페"],
            url: "http://www.j-ostiel.co.kr/",
            callnumber: "02-2635-2222",
            star:3,
            like: false,
            img: "http://www.hyowon.com/data/wed_event/27a47482e65fbae1de954609740929c4ed_crop.jpg"
        },
        {
            id:2,
            name:"켄싱턴호텔 여의도",
            address: "서울 영등포구 국회대로76길 16 (여의도동) 켄싱턴호텔 여의도",
            tag: ["#분리", "#여의도", "#한식", "#양식", "#동시"],
            url: "http://www.kensingtonyoido.co.kr/Convention/Wedding.aspx",
            callnumber: "02-2635-2222",
            star:5,
            like: false,
            img: "https://dnna01d8m6k3w.cloudfront.net/profile/201812/20181213/1a2d98dd-b1a5-4f8f-8566-d1501834ccd3.jpg"
        },
        {
            id:3,
            name:"로프트가든344",
            address: "서울 양천구 오목로 344 (목동, 청학빌딩) 8층",
            tag: ["#일반홀", "#오목교역", "#한식", "#양식", "#동시"],
            url: "https://www.loftgarden344.com/",
            callnumber: "0504-0536-0239",
            star:5,
            like: false,
            img: "https://dnna01d8m6k3w.cloudfront.net/profile/201812/20181213/1a2d98dd-b1a5-4f8f-8566-d1501834ccd3.jpg"
        },
        {
            id:4,
            name:"베르가모",
            address: "서울 양천구 오목로 344 (목동, 청학빌딩) 8층",
            tag: ["#일반홀", "#오목교역", "#한식", "#양식", "#동시"],
            url: "https://www.loftgarden344.com/",
            callnumber: "0504-0536-0239",
            star:5,
            like: false,
            img: "https://dnna01d8m6k3w.cloudfront.net/profile/201812/20181213/1a2d98dd-b1a5-4f8f-8566-d1501834ccd3.jpg"
        },
        {
            id:5,
            name:"케이터틀",
            address: "서울 마포구 백범로 23 (신수동, 거구장)",
            tag: ["#일반홀", "#신촌역", "#뷔페", "#단독"],
            url: "http://k-turtle.co.kr/main/main.php",
            callnumber: "02-715-3611",
            star:5,
            like: false,
            img: "http://www.k-turtle.co.kr/main/img/mv/6.jpg"
        }
    ]
}

const mutations = { // 순차적인 로직만

}

const actions = { // 비동기적 로직만
    
}

const getters = {
    getData: state => state.data
}

export default new Vuex.Store({
    state,
    getters,
    actions,
    mutations,
})