import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yuangong from '@/views/modules/yuangong/list'
    import gongzi from '@/views/modules/gongzi/list'
    import wupinshangbao from '@/views/modules/wupinshangbao/list'
    import qingjiaxinxi from '@/views/modules/qingjiaxinxi/list'
    import wupinku from '@/views/modules/wupinku/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import wupinshenqing from '@/views/modules/wupinshenqing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '公司公告',
        component: news
      }
          ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
          ,{
	path: '/gongzi',
        name: '工资',
        component: gongzi
      }
          ,{
	path: '/wupinshangbao',
        name: '物品上报',
        component: wupinshangbao
      }
          ,{
	path: '/qingjiaxinxi',
        name: '请假信息',
        component: qingjiaxinxi
      }
          ,{
	path: '/wupinku',
        name: '物品库',
        component: wupinku
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/wupinshenqing',
        name: '物品申请',
        component: wupinshenqing
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
