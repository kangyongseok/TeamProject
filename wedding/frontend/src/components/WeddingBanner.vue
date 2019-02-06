<template>
  <div class="banner-area">
    <div class="banner-txt">
      <p>
        당신의 선택,<br/>
        더이상 신경쓰지마세요
      </p>
      <button class="btn btn-review-write">
        리뷰 작성하고 전체열람하기
      </button>
    </div>
  </div>
</template>

<script>
export default {

}
</script>

<style>
.banner-area {
  background: #eeeeee;
  position: relative;
  height:450px;
}

.banner-area::before {
  content:'';
  display:block;
  width:100%;
  position: absolute;
  top:0;
  bottom:0;
  left:0;
  right:0;
  background: url('https://ph.dailysecu.com/news/photo/201811/40971_33549_5751.jpg') no-repeat 50% 50%;
}

.banner-txt {
  position: absolute;
  top:50%;
  left:50%;
  padding:2em 5em;
  transform:translate(-50%, -50%);
  background: rgba(0, 0, 0, 0.3);
  margin:0 auto;
  color:white;
  text-align: center;
  font-size:1.5rem;
}

.banner-txt .btn-review-write {
  border:1px solid white;
  width:100%;
  padding:1rem 0;
  margin-top:1rem;
  font-size:0.8rem;
  color:white;
}

.banner-txt .btn-review-write:hover {
  background: #00A591;
}

</style>
