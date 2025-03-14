const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm9037f/",
            name: "ssm9037f",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm9037f/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "企业台账管理平台"
        } 
    }
}
export default base
