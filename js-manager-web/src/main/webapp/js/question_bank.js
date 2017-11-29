var vm = new Vue({
	el:'#app',
	data:{
		sortList:[
			{
				num:'21',
				name:'2016中国纱线网知识竞赛复赛111',
				tempalte:'考试',
				startTime:'2017/02/27 08:25:00',
				stopTime:'2017/03/28 08:25:00',
				opinionNum:'10',
				chooseNum:'20',
				choiceNum:'30'
			},
			{
				num:'22',
				name:'2016中国纱线网知识竞赛复赛222',
				tempalte:'考试',
				startTime:'2017/02/27 08:25:00',
				stopTime:'2017/03/28 08:25:00',
				opinionNum:'40',
				chooseNum:'50',
				choiceNum:'60'
			},
			{
				num:'23',
				name:'2016中国纱线网知识竞赛复赛222',
				tempalte:'考试',
				startTime:'2017/02/27 08:25:00',
				stopTime:'2017/03/28 08:25:00',
				opinionNum:'40',
				chooseNum:'50',
				choiceNum:'60'
			}
		],
		//全选
		checkAllfalg:false,
		//分页页数
		pagination:[
			'1',
			'2',
			'3',
			'4',
			'5',
			'6',
			'7',
			'8'
		],
		//当前分页页码
		activepage:0
	},
	mounted:function(){},
	watch:{},
	methods:{
		//顶部全选
		topAllchecked:function(){
			var _this = this
			if(_this.checkAllfalg == false){
				_this.checkAllfalg = true
				this.sortList.forEach(function(item,index){
					_this.$set(item,'checkRadio',_this.checkAllfalg);
				})
			}else{
				this.checkAllfalg = false
				this.sortList.forEach(function(item,index){
					_this.$set(item,'checkRadio',_this.checkAllfalg);
				})
			}
			console.log(this.checkAllfalg)
		},
		//每项单选
		checkRadio:function(item){
			var _this = this
			if(typeof item.checkRadio == 'undefined'){
				_this.$set(item,'checkRadio',true);
				// this.checkAllfalg = true;	
				console.log('没有')
			}else{
				item.checkRadio = !item.checkRadio;
				_this.sortList.forEach(function(items,index){
					if(item.checkRadio == false){
						_this.checkAllfalg = false
					}else if(item.checkRadio == true){
						_this.checkAllfalg = true
					}
				})
				console.log('you')
			}
		},
		//底部全选，取消全选
		allchecked:function(way){
			this.checkAllfalg = way;
			var _this = this;
			this.sortList.forEach(function(item,index){
				if(typeof item.checkRadio == 'undefined'){
					_this.$set(item,'checkRadio',_this.checkAllfalg);
				}else{
					item.checkRadio = _this.checkAllfalg;
				}
			})
		},
		//分页
		changePage:function(num){
			this.activepage += num
			if(this.activepage >= this.pagination.length){
				this.activepage = this.pagination.length-1	
			}else if(this.activepage <= 0){
				this.activepage = 0
			}
		}
	}
})