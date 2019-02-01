<template>
    <div >
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <div class="card-img">
            <img :src="this.img" alt="">
        </div>
        <div class="card-info">
            <h4 class="card-title">{{this.title}}</h4>
            <p>
                {{this.addr}}
            </p>
        </div>
        <div class="card-icon-info">
            <div class="stars">
                <font-awesome-icon icon="star" v-for="s in this.star" />
                {{this.star === 0 ? '평가없음' : ''}}
            </div>
            <div>
                <button :class="{select:hallLike}" v-on:click="clickLike(hallLike)"><font-awesome-icon icon="heart"/></button>
            </div>
            
        </div>

    </div>
</template>

<script>
export default {
    data() {
        return {
            hallLike: this.like
        }
    },
    created() {
        
    },
    methods: {
        clickLike:function(hallLike) {
            if(hallLike) {
                this.hallLike = false
            }else {
                this.hallLike = true
            }
        }
    },
    props:[
        'title',
        'star',
        'img',
        'like',
        'addr'
    ]
}
</script>

<style lang="scss" scope>
    
        .card-img {
            width:100%;
            overflow: hidden;
            border-radius: 5px 5px 0 0;
        }
        img {
            display: block;
            width:100%;
        }
        .card-info {
            padding:2rem;
            p {
                margin-top:1rem;
                color:#666666;
            }
        }
        .card-icon-info {
            border-top:1px solid #cccccc;
            padding:1rem 2rem;
            display: flex;
            button {
                border:none;
                background:none;
                cursor:pointer;
                font-size:1rem;
                color:#cccccc;
                outline: none;
            }
            .stars {
                margin-right:auto;
            }
            .select {
                color:red;
            }
        }
    
</style>
