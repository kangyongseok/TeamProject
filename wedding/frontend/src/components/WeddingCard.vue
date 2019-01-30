<template>
    <div class="hall-card" >
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
            1
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style lang="scss" scope>
    .hall-card {
        width:30%;
        height:400px;
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
