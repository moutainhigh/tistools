/**
 * Created by wangbo on 2017/6/11.
 */
angular.module('MetronicApp').controller('role_controller', function($rootScope, $scope ,$modal,$http,i18nService, $timeout,filterFilter,$uibModal,uiGridConstants) {
        var role = {};
        $scope.role = role;
        /* 左侧角色查询逻辑 */
        i18nService.setCurrentLang("zh-cn");
        //ui-grid
        $scope.myData = [
            {'ROLE_CODE': "001000", 'ROLE_NAME': '角色名称','ROLE_TYPE':'一类','GUID_APP':"测试"},
            {'ROLE_CODE': "001001", 'ROLE_NAME': '角色名称','ROLE_TYPE':'一类','GUID_APP':"搜索"},
            {'ROLE_CODE': "001002", 'ROLE_NAME': '角色名称','ROLE_TYPE':'二类','GUID_APP':"查询"}
        ];
        //ui-grid 具体配置

    var gridOptions = {};
    $scope.gridOptions = gridOptions;
    var initdata = function(){
        return $scope.myData;//数据方法
    }
    var com = [{ field: 'ROLE_CODE', displayName: '角色代码'},
        { field: "ROLE_NAME", displayName:'角色名称'},
        { field: "ROLE_TYPE", displayName:'角色类别',
            //配置搜索下拉框
            filter:{
                //term: '0',//默认搜索那项
                type: uiGridConstants.filter.SELECT,
                selectOptions: [{ value: '一类', label: '一类' }, { value: '二类', label: '二类' }]
            }},
        { field: "GUID_APP", displayName:'隶属应用'}
    ];
    var f = function(row){
        if(row.isSelected){
            $scope.selectRow = row.entity;
            $scope.role.shows = true;
            console.log($scope.selectRow)
        }else{
            delete $scope.selectRow;//制空
            $scope.role.shows = false;
        }
    }
    $scope.gridOptions = initgrid($scope,gridOptions,initdata(),filterFilter,com,false,f);
        //新增逻辑
        $scope.role_add = function(){
            openwindow($modal, 'views/roleManage/rolemanageAdd.html', 'lg',//弹出页面
                function ($scope, $modalInstance) {
                    $scope.add = function(item){
                        //新增代码
                        toastr['success']("保存成功！");
                        $modalInstance.close();
                    }
                    $scope.cancel = function () {
                        $modalInstance.dismiss('cancel');
                    };

                })
        }
        //修改逻辑
        $scope.role_edit = function(id){
           if($scope.selectRow){
               openwindow($modal, 'views/roleManage/rolemanageAdd.html', 'lg',//弹出页面
                   function ($scope, $modalInstance) {
                       $scope.id = id;
                       $scope.add = function(item){
                           //新增代码
                           toastr['success']("修改成功！");
                           $modalInstance.close();
                       }
                       $scope.cancel = function () {
                           $modalInstance.dismiss('cancel');
                       };
                   })
           }else{
               toastr['error']("请至少选择一条数据进行修改！");
           }
        }
        //删除逻辑
        $scope.role_delete = function(){
            if($scope.selectRow){
                confirm("您确认要删除选中的角色吗,删除角色将同时删除角色的功能分配信息以及角色在操作员和组织对象上的分配")
                toastr['success']("删除成功！");
            }else{
                toastr['error']("请至少选择一条数据进行删除！");
            }
        }

    /* tab 栏切换逻辑 */
    var roleflag = {};
    $scope.roleflag = roleflag;
    //应用信息
    var limit = false;
    roleflag.limit = limit;
    //功能组列表
    var dist = false;
    roleflag.dist = dist;
    //权限与操作员
    var operatorer =operatorer;
    roleflag.operatorer = operatorer;
    //初始化tab展现
    $scope.roleflag.limit = true;
    //控制页切换代码
    role.loadgwdata = function (type) {
        if(type == 0){
            for(var i in $scope.rolesflag){
                $scope.rolesflag[i] = false;
            }
            $scope.roleflag.limit = true;
            $scope.roleflag.dist = false;
            $scope.roleflag.operatorer = false;
        }else if (type == 1){
            for(var i in $scope.rolesflag){
                $scope.rolesflag[i] = false;
            }
            $scope.roleflag.limit = false;
            $scope.roleflag.dist = true;
            $scope.roleflag.operatorer = false;
            $scope.rolesflag.org = true;//初始化打开
        }else if (type == 3){
            for(var i in $scope.rolesflag){
                $scope.rolesflag[i] = false;
            }
            $scope.rolesflag.org = true;
        }else if (type == 4){
            for(var i in $scope.rolesflag){
                $scope.rolesflag[i] = false;
            }
            $scope.rolesflag.worklist = true;
        }else if (type == 5){
            for(var i in $scope.rolesflag){
                $scope.rolesflag[i] = false;
            }
            $scope.rolesflag.post = true;
        }else if (type == 6){
            for(var i in $scope.rolesflag){
                $scope.rolesflag[i] = false;
            }
            $scope.rolesflag.zhiwei = true;
            console.log(rolesflag.zhiwei)
        }else if (type == 7){
            for(var i in $scope.rolesflag){
                $scope.rolesflag[i] = false;
            }

            $scope.roleflag.operatorer = true;
            $scope.roleflag.limit = false;
            $scope.roleflag.dist = false;
            //console.log($scope.roleflag.operatorer);
        }

    }
    /* 树结构逻辑代码*/
    //树过滤
    $("#s").submit(function(e) {
        e.preventDefault();
        $("#container").jstree(true).search($("#q").val());
    });


    //  应用管理树结构
    $("#container").jstree({
        "core" : {
            "themes" : {
                "responsive": false
            },
            "check_callback" : true,
            'data':
                [{
                    "id": "1",
                    "text": "应用功能管理",
                    "children":
                        [
                            {
                                "id": "2",
                                "text": "应用基础框架",
                                "children":
                                    [
                                        {
                                            "id": "4",
                                            "text": "授权认证",
                                            'type':'fun',
                                            "children":[{
                                                'id':'75',
                                                "text": "登陆策略管理"
                                            },{
                                                'id':'76',
                                                "text": "操作员管理"
                                            },{
                                                'id':'77',
                                                "text": "Prota资源管理"
                                            },{
                                                'id':'78',
                                                "text": "密码设置",
                                                'type':'childs'
                                            },
                                                {
                                                    'id':'79',
                                                    "text": "子功能组",
                                                    'type':'fun',
                                                    "children":[{
                                                        'id':'80',
                                                        "text": "菜单显示",
                                                        'type':'childs'
                                                    }]
                                                }
                                            ]
                                        },{
                                        "id": "5",
                                        "text": "权限管理",
                                        'type':'fun',
                                        "children":[{
                                            'id':'81',
                                            "text": "应用功能管理",
                                        },{
                                            'id':'82',
                                            "text": "菜单显示",
                                        },{
                                            'id':'83',
                                            "text": "菜单管理",
                                        },{
                                            'id':'84',
                                            "text": "约束管理",
                                        },{
                                            'id':'85',
                                            "text": "角色管理",
                                        },

                                        ]
                                    },{
                                        "id": "6",
                                        "text": "组织管理",
                                        'type':'fun',
                                    }]
                            },
                            {
                                "id": "3",
                                "text": "测试应用",
                            }
                        ]
                }
                ]
        },
        "force_text": true,
        plugins: ["sort", "types", "checkbox", "themes", "html_data"],
        "checkbox": {
            "keep_selected_style": false,//是否默认选中
        },
        "types" : {
            "default" : {
                "icon" : "fa fa-folder icon-state-warning icon-lg"
            },
            "file" : {
                "icon" : "fa fa-file icon-state-warning icon-lg"
            }
        },
        "state" : { "key" : "demo3" },
        'dnd': {
            'dnd_start': function () {
                console.log("start");
            },
            'is_draggable':function (node) {
                return true;
            }
        },
        'callback' : {
            move_node:function (node) {
            }
        },
        "plugins" : [ "wholerow", "checkbox" ]
    }).bind("copy.jstree", function (node,e, data ) {
    })

    $scope.role.checkAll = function(){
        var nodes=$("#container").jstree("get_checked");
        if(nodes.length> 0 ){
            console.log(nodes);//获取所有节点的id
            toastr['success']("保存成功！");
        }else{
            toastr['error']("请至少选择一个分配权限！");
        }
    }

    /*权限分配业务逻辑*/
    var rolesflag = {};
    $scope.rolesflag = rolesflag;
    //操作员
    var operators = false;
    rolesflag.operators = operators;
    //机构
    var org = false;
    rolesflag.org = org;
    //工作组
    var worklist = false;
    rolesflag.worklist = worklist;
    //岗位
    var post = false;
    rolesflag.post = post;
    //职位
    var position = false;
    rolesflag.position = position;
    //初始化tab展现
    $scope.rolesflag.operators = true;




    /*tab下机构详情*/
    $scope.orgData = [{ROLE_NAME: "成成", ROLE_CODE: 'TX1001',ROLE_org:'组织机构'},
        {ROLE_NAME: "豪豪", ROLE_CODE: 'TX1002',ROLE_org:'上海分行'},
        {ROLE_NAME: "肖肖", ROLE_CODE: 'TX1003',ROLE_org:'内容分行'},
    ]

    var gridOptions2 = {};
    $scope.gridOptions2 = gridOptions2;
    var initdata2 = function(){
        return $scope.orgData;//数据方法
    }
    var com2 = [{ field: 'ROLE_NAME', displayName: '角色名称'},
        { field: "ROLE_CODE", displayName:'角色代码'},
        { field: "ROLE_org", displayName:'所属机构'}
    ];
    var f2 = function(row){
        if(row.isSelected){
            $scope.selectRow2 = row.entity;
            console.log($scope.selectRow2)
        }else{
            delete $scope.selectRow2;//制空
        }
    }
    $scope.gridOptions2 = initgrid($scope,gridOptions2,initdata2(),filterFilter,com2,false,f2);
    //新增操作员方法
    $scope.role.orgAdd = function(){
        openwindow($modal, 'views/roleManage/roleAddorg.html', 'lg',//弹出页面
            function ($scope, $modalInstance) {
                $scope.add = function(item){
                    //新增代码
                    toastr['success']("新增操作员成功！");
                    $modalInstance.close();
                }
                $scope.cancel = function () {
                    $modalInstance.dismiss('cancel');
                };
            })
    }
    //修改tab操作员方法
    $scope.role_orgEdit = function(id){
        if($scope.selectRow2){
            openwindow($modal, 'views/roleManage/roleAddorg.html', 'lg',//弹出页面
                function ($scope, $modalInstance) {
                    $scope.add = function(item){
                        $scope.id = id;
                        //新增代码
                        toastr['success']("新增操作员成功！");
                        $modalInstance.close();
                    }
                    $scope.cancel = function () {
                        $modalInstance.dismiss('cancel');
                    };
                })
        }else{
            toastr['error']("请最少选中一条进行编辑！");
        }
    }
    //删除tab组织方法
    $scope.role_orgDelete = function(){
        if($scope.selectRow2){
            confirm('确定要删除对应组织吗')
            toastr['success']("删除对应机构成功！");
        }else{
            toastr['error']("请最少选中一条进行删除！");
        }
    }




    /* tab 下对应工作组管理详情*/
    $scope.workData = [{ROLE_NAME: "成成", ROLE_CODE: 'TX1001',ROLE_work:'搜索组'},
        {ROLE_NAME: "豪豪", ROLE_CODE: 'TX1002',ROLE_work:'查询组'},
        {ROLE_NAME: "肖肖", ROLE_CODE: 'TX1003',ROLE_work:'交易组'},
    ]

    var gridOptions3 = {};
    $scope.gridOptions3 = gridOptions3;
    var initdata3 = function(){
        return $scope.workData;//数据方法
    }
    var com3 = [{ field: 'ROLE_NAME', displayName: '角色名称'},
        { field: "ROLE_CODE", displayName:'角色代码'},
        { field: "ROLE_work", displayName:'所属工作组'}
    ];
    var f3 = function(row){
        if(row.isSelected){
            $scope.selectRow3 = row.entity;
            console.log($scope.selectRow3)
        }else{
            delete $scope.selectRow3;//制空
        }
    }
    $scope.gridOptions3 = initgrid($scope,gridOptions3,initdata3(),filterFilter,com3,false,f3);

    //新增tab下功能组方法
    $scope.role.workAdd = function(){
        openwindow($modal, 'views/roleManage/roleAddwork.html', 'lg',//弹出页面
            function ($scope, $modalInstance) {
                $scope.add = function(item){
                    //新增代码
                    toastr['success']("新增操作员成功！");
                    $modalInstance.close();
                }
                $scope.cancel = function () {
                    $modalInstance.dismiss('cancel');
                };
            })
    }
    //修改tab功能组方法
    $scope.role_workEdit = function(id){
        if($scope.selectRow3){
            openwindow($modal, 'views/roleManage/roleAddwork.html', 'lg',//弹出页面
                function ($scope, $modalInstance) {
                    $scope.id =id ;
                    $scope.add = function(item){
                        //新增代码
                        toastr['success']("新增操作员成功！");
                        $modalInstance.close();
                    }
                    $scope.cancel = function () {
                        $modalInstance.dismiss('cancel');
                    };
                })
        }else{
            toastr['error']("请最少选中一条进行编辑！");
        }
    }
    //删除tab操作员方法
    $scope.role_workDelete = function(){
        if($scope.selectRow3){
            confirm('确定要删除对应操作员吗')
            toastr['success']("删除对应功能组成功！");
        }else{
            toastr['error']("请最少选中一条进行删除！");
        }
    }


    /*角色与岗位关系*/
    $scope.postData = [{ROLE_NAME: "成成", ROLE_CODE: 'TX1001',ROLE_post:'搜索岗'},
        {ROLE_NAME: "豪豪", ROLE_CODE: 'TX1002',ROLE_post:'查询岗'},
        {ROLE_NAME: "肖肖", ROLE_CODE: 'TX1003',ROLE_post:'交易岗'},
    ]
    var gridOptions4 = {};
    $scope.gridOptions4 = gridOptions4;
    var initdata4 = function(){
        return $scope.postData;//数据方法
    }
    var com4 = [{ field: 'ROLE_NAME', displayName: '角色名称'},
        { field: "ROLE_CODE", displayName:'角色代码'},
        { field: "ROLE_post", displayName:'岗位'}
    ];
    var f4 = function(row){
        if(row.isSelected){
            $scope.selectRow4 = row.entity;
            console.log($scope.selectRow4)
        }else{
            delete $scope.selectRow4;//制空
        }
    }
    $scope.gridOptions4 = initgrid($scope,gridOptions3,initdata4(),filterFilter,com4,false,f4);


    //新增tab下功能组方法
    $scope.role.postAdd = function(){
        openwindow($modal, 'views/roleManage/roleAddpost.html', 'lg',//弹出页面
            function ($scope, $modalInstance) {
                $scope.add = function(item){
                    //新增代码
                    toastr['success']("新增操作员成功！");
                    $modalInstance.close();
                }
                $scope.cancel = function () {
                    $modalInstance.dismiss('cancel');
                };
            })
    }
    //修改tab功能组方法
    $scope.role_postEdit = function(id){
        if($scope.selectRow4){
            openwindow($modal, 'views/roleManage/roleAddpost.html', 'lg',//弹出页面
                function ($scope, $modalInstance) {
                    $scope.id = id;
                    $scope.add = function(item){
                        //新增代码
                        toastr['success']("新增操作员成功！");
                        $modalInstance.close();
                    }
                    $scope.cancel = function () {
                        $modalInstance.dismiss('cancel');
                    };
                })
        }else{
            toastr['error']("请最少选中一条进行编辑！");
        }
    }
    //删除tab操作员方法
    $scope.role_postDelete = function(){
        if($scope.selectRow4){
            confirm('确定要删除对应岗位吗')
            toastr['success']("删除角色对应岗位成功！");
        }else{
            toastr['error']("请最少选中一条进行删除！");
        }
    }

    //职务内容列表

    $scope.zwDate = [{ROLE_NAME: "成成", ROLE_CODE: 'TX1001',ROLE_ZhiWU:'总经理'},
        {ROLE_NAME: "豪豪", ROLE_CODE: 'TX1002',ROLE_ZhiWU:'经理'},
        {ROLE_NAME: "肖肖", ROLE_CODE: 'TX1003',ROLE_ZhiWU:'测试'},
    ]

    var gridOptionzw = {};
    $scope.gridOptionzw = gridOptionzw;
    var initdatazw = function(){
        return $scope.zwDate;//数据方法
    }
    var comzw = [{ field: 'ROLE_NAME', displayName: '角色名称'},
        { field: "ROLE_CODE", displayName:'角色代码'},
        { field: "ROLE_ZhiWU", displayName:'职务'}
    ];
    var fzw = function(row){
        if(row.isSelected){
            $scope.selectRowzw = row.entity;
            console.log($scope.selectRowzw)
        }else{
            delete $scope.selectRowzw;//制空
        }
    }
    $scope.gridOptionzw = initgrid($scope,gridOptionzw,initdatazw(),filterFilter,comzw,false,fzw);

    //新增tab下功能组方法
    $scope.role.zhiwuAdd = function(){
        openwindow($modal, 'views/roleManage/roleAddzw.html', 'lg',//弹出页面
            function ($scope, $modalInstance) {
                $scope.add = function(item){
                    //新增代码
                    toastr['success']("新增操作员成功！");
                    $modalInstance.close();
                }
                $scope.cancel = function () {
                    $modalInstance.dismiss('cancel');
                };
            })
    }
    //修改tab功能组方法
    $scope.role.zhiwuEdit = function(id){
        if($scope.selectRowzw){
            openwindow($modal, 'views/roleManage/roleAddzw.html', 'lg',//弹出页面
                function ($scope, $modalInstance) {
                    $scope.id = id;
                    $scope.add = function(item){
                        //新增代码
                        toastr['success']("新增职务成功！");
                        $modalInstance.close();
                    }
                    $scope.cancel = function () {
                        $modalInstance.dismiss('cancel');
                    };
                })
        }else{
            toastr['error']("请最少选中一条进行编辑！");
        }
    }
    //删除tab操作员方法
    $scope.role.zhiwuDelete = function(){
        if($scope.selectRowzw){
            confirm('确定要删除对应职务吗')
            toastr['success']("删除角色对应职务成功！");
        }else{
            toastr['error']("请最少选中一条进行删除！");
        }
    }





    /*权限与操作员详情*/
    //ui-grid
    $scope.myDataer = [
        {'OPERATOR_NAME': "成", 'OPERATOR_STATUS': 'TX10001','USER_ID':'成','AUTH_MODE':"本地密码认证"},
        {'OPERATOR_NAME': "波", 'OPERATOR_STATUS': 'TX2002','USER_ID':'波','AUTH_MODE':"LDAP认证"},
        {'OPERATOR_NAME': "李", 'OPERATOR_STATUS': 'TX3002','USER_ID':'李','AUTH_MODE':"本地密码认证"}
    ];
    var gridOptioner = {};
    $scope.gridOptioner = gridOptioner;
    var initdataer = function(){
        return $scope.myDataer;//数据方法
    }
    var comer = [{ field: 'OPERATOR_NAME', displayName: '操作员姓名'},
        { field: "OPERATOR_STATUS", displayName:'操作员状态'},
        { field: "USER_ID", displayName:'登录用户名'},
        { field: "AUTH_MODE", displayName:'认证模式'}
    ];
    var fer = function(row){
        if(row.isSelected){
            $scope.selectRower = row.entity;
            console.log($scope.selectRower)
        }else{
            delete $scope.selectRower;//制空
        }
    }
    $scope.gridOptioner = initgrid($scope,gridOptioner,initdataer(),filterFilter,comer,false,fer);


    //新增操作员逻辑
    $scope.role.operaAdd = function(){
        openwindow($modal, 'views/roleManage/roleoperAdd.html', 'lg',//弹出页面
            function ($scope, $modalInstance) {
                $scope.add = function(item){
                    //新增代码
                    toastr['success']("新增成功！");
                    $modalInstance.close();
                }
                $scope.cancel = function () {
                    $modalInstance.dismiss('cancel');
                };

            })
    }
    //修改操作员逻辑
    $scope.role.operaEdit = function(id){
        if($scope.selectRower){
            openwindow($modal, 'views/roleManage/roleoperAdd.html', 'lg',//弹出页面
                function ($scope, $modalInstance) {
                    $scope.id = id;
                    $scope.add = function(item){
                        //新增代码
                        toastr['success']("新增成功！");
                        $modalInstance.close();
                    }
                    //新增操作员弹窗保存
                    $scope.add = function(item){
                        toastr['success']("保存成功！");
                        $modalInstance.close();
                    }
                    $scope.cancel = function () {
                        $modalInstance.dismiss('cancel');
                    };

                })
        }else{
            toastr['error']("请选中一条进行修改！");
        }
    }
    //删除操作员逻辑
    $scope.role.operaDelete = function(){
        if($scope.selectRower){
            confirm('确定要删除选中操作员吗?')
            toastr['success']("删除成功！");
        }else{
            toastr['error']("请选中一条进行删除！");
        }
    }
});
