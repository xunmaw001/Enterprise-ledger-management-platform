
var projectName = '企业台账管理平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '物品库',
	url: './pages/wupinku/list.html'
}, 

{
	name: '公司公告',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm9037f/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"工资","menuJump":"列表","tableName":"gongzi"}],"menu":"工资管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"物品库","menuJump":"列表","tableName":"wupinku"}],"menu":"物品库管理"},{"child":[{"buttons":["查看","修改","审核"],"menu":"物品申请","menuJump":"列表","tableName":"wupinshenqing"}],"menu":"物品申请管理"},{"child":[{"buttons":["查看","修改","审核"],"menu":"物品上报","menuJump":"列表","tableName":"wupinshangbao"}],"menu":"物品上报管理"},{"child":[{"buttons":["查看","修改","审核"],"menu":"请假信息","menuJump":"列表","tableName":"qingjiaxinxi"}],"menu":"请假信息管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"公司公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请"],"menu":"物品库列表","menuJump":"列表","tableName":"wupinku"}],"menu":"物品库模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"工资","menuJump":"列表","tableName":"gongzi"}],"menu":"工资管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"物品申请","menuJump":"列表","tableName":"wupinshenqing"}],"menu":"物品申请管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"物品上报","menuJump":"列表","tableName":"wupinshangbao"}],"menu":"物品上报管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"请假信息","menuJump":"列表","tableName":"qingjiaxinxi"}],"menu":"请假信息管理"}],"frontMenu":[{"child":[{"buttons":["查看","申请"],"menu":"物品库列表","menuJump":"列表","tableName":"wupinku"}],"menu":"物品库模块"}],"roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
