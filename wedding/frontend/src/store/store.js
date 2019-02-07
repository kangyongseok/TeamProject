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
            img: "http://www.hyowon.com/data/wed_event/27a47482e65fbae1de954609740929c4ed_crop.jpg",
            reviews: [
                {
                    title: "음식도 좋고 넓었으나 단독홀과 예식이 짧아 사람들이 모여서 너무혼잡햇어요ㅠㅠ",
                    totalRating: 3,
                    date: "2019.01.23",
                    txt: "웨딩홀은 완전 제 맘에 쏙 들었어요~~ 식전촬영이랑 신부대기실 이벤트까지! 다른 웨딩홀이랑 다른게 이런부분들은 잘되어있더라구요~ 홀이 작지만 수용인원이 적은분들께는 최고일것같아요^^ 인테리어, 연회장까지 최고였어요!"
                },
                {
                    title: "홀이 들어가자마자 생화 냄새가 홀을 가득 채워서 기분이 좋았어요.",
                    totalRating: 4,
                    date: "2018.07.10",
                    txt: "여러군데 예식장 다 돌아다니다 마지막으로 여기도 한번 가보자 하면서 들렸던 여율리인데 결국 이곳에서 식을 올리게 되었네요! 가득한 생화향기에 맛있는 음식까지 많은 부분을 만족하게 했던 베뉴입니다. 식 시간이 60분 간격인건 아쉽지만, 대신 직계가족 촬영을 식 전으로 당겨 가장 예쁜 컨디션으로 웃으며 사진을 남길 수 있기도 하고 예식 시간 중 그 시간을 세이브 할 수도 있어서 좋았습니다"
                }
            ]
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
            img: "https://dnna01d8m6k3w.cloudfront.net/profile/201812/20181213/1a2d98dd-b1a5-4f8f-8566-d1501834ccd3.jpg",
            reviews: [
                {
                    title: "예비신랑과 함께 상담받고 진행했습니다^^ 홀 인테리어도 예쁘고 음식도 맛있어서 고민안하고 바로 결정했어요~",
                    totalRating: 3,
                    date: "2019.01.23",
                    txt: "인테리어랑 전체적인 분위기가 매우 고급스럽고 예쁩니다~^^"
                },
                {
                    title: "1월 8일 예랑이와 함께 첫 예식장 방문하여 다른식장 알아본후에 최종 선택하였습니다.",
                    totalRating: 4,
                    date: "2018.07.10",
                    txt: "인천에서 이렇게 맛있는 식장은 처음이에요~ 다들 추천하는데는 다 이유가 있었다는것"
                }
            ]
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