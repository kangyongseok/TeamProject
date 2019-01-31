<template>
    <div class="hall-card" >
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <div class="card-img">
            <img src="../assets/c1.jpg" alt="">
        </div>
        <div class="card-info">
            <h4 class="card-title">OO 웨딩홀</h4>
            <p>
                경기도 고양시 일산동구 백석동 1288-2
            </p>
        </div>
        <div class="card-icon-info">
            <div><font-awesome-icon icon="star" /></div>
            
        </div>

    </div>
</template>

<script>
export default {
    data() {
        return {
            
        }
    },
    created() {
        
    },
    methods: {
        
    },
    props:[
        
    ]
}
</script>

<style lang="scss" scope>
    .hall-card {
        width:30%;
        margin:auto;
        margin-bottom:2rem;
        box-shadow: 3px 3px 10px 1px rgba(0, 0, 0, 0.3);
        border-radius: 5px;
        .card-img {
            width:100%;
            height:200px;
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
        }
    }
</style>
