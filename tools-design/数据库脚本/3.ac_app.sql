﻿INSERT INTO `AC_APP` VALUES ('APP1499956132', 'APP01', 'ABF', 'local', 'N', '2017-09-06 00:00:00', '192.168.2.202', '应用管理的描述', 'EMPLOYEE1503319028', 'ROLE1502354676', null, null, null, '192.168.2.202', '8090');



INSERT INTO `AC_FUNCGROUP` VALUES ('FUNCGROUP1500544714', 'APP1499956132', '应用管理', null, '1', 'APP1499956132.FUNCGROUP1500544714', 'Y', '0');
INSERT INTO `AC_FUNCGROUP` VALUES ('FUNCGROUP1500544715', 'APP1499956132', '组织机构管理', 'FUNCGROUP1500544714', '1', 'APP1499956132.FUNCGROUP1500544714.FUNCGROUP1500544715', 'Y', '0');
INSERT INTO `AC_FUNCGROUP` VALUES ('FUNCGROUP1500544716', 'APP1499956132', '权限管理', 'FUNCGROUP1500544714', '1', 'APP1499956132.FUNCGROUP1500544714.FUNCGROUP1500544716', 'Y', '0');
INSERT INTO `AC_FUNCGROUP` VALUES ('FUNCGROUP1500544717', 'APP1499956132', '操作员管理', 'FUNCGROUP1500544714', '1', 'APP1499956132.FUNCGROUP1500544714.FUNCGROUP1500544717', 'Y', '0');
INSERT INTO `AC_FUNCGROUP` VALUES ('FUNCGROUP1500544718', 'APP1499956132', '其他管理', 'FUNCGROUP1500544714', '1', 'APP1499956132.FUNCGROUP1500544714.FUNCGROUP1500544718', 'Y', '0');
INSERT INTO `AC_FUNCGROUP` VALUES ('FUNCGROUP1503036154', 'APP1502700977', '测试功能组', null, '1', 'APP1502700977.FUNCGROUP1503036154', 'Y', '0');

INSERT INTO `AC_FUNC` VALUES ('1', '1', '1', '1', null, null, null, '\'1\'', null, null);
INSERT INTO `AC_FUNC` VALUES ('2', '2', '2', '2', null, null, null, '\'1\'', null, null);
INSERT INTO `AC_FUNC` VALUES ('FUNC1499074823', 'FUNCGROUP1499074560', 'FSA1201', '交易功能', null, '1231231', '100', 'a', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499074824', 'FUNCGROUP1499074560', 'GSA1021', '测试功能', null, '1231231', '100', 's', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499074825', 'FUNCGROUP1499074562', 'FSA112201', '组织机构功能', null, '192.168.2.202', '测试', 'a', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499074826', 'FUNCGROUP1499074562', '3123', '功能组车市', null, '1231231', '测试', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499074827', 'FUNCGROUP1499074563', 'FDS1202', '工作流功能', null, '1231231', '1111', 's', 'n', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499074828', 'FUNCGROUP1499074563', 'FDS4520', '工作功能而二人2', null, '192.168.3.360', '152033.02', 's', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499130355', 'FUNCGROUP1499074579', 'FDSA1201', '测试功能', null, '1195.233.202.203', '2312321323', 'a', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499130356', 'FUNCGROUP1499074579', 'FDS1201', '功能能够列表测试', null, '1231231', '1231231', 'a', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499130389', '', 'FS155', '功能也出现了', null, '192.656.2.303', '192.656.2.303', 's', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499130390', '', 'FSA455', '该功能也出现了', null, '1231231', '1231231', 's', 'y', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956281', 'FUNCGROUP1499956151', 'FUN001', '组织机构管理', '组织机构管理', '192.168.2.202', '192.168.2.202', 's', 'n', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956291', 'FUNCGROUP1499956151', 'FUN00001', '员工管理', '员工管理', '192.168.2.202', '1231231192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956292', 'FUNCGROUP1499956151', 'FUNf002', '业务机构', '业务机构', '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956293', 'FUNCGROUP1499956151', 'FUN00023', '工作组', '工作组', '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956294', 'FUNCGROUP1499956151', 'FUN020', '职务定义', '职务定义', '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956295', 'FUNCGROUP1499956152', 'FUNAp01', '应用功能管理', null, '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956296', 'FUNCGROUP1499956152', 'FUNmenu001', '菜单管理', null, '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956297', 'FUNCGROUP1499956152', 'FUN0111', '功能行为类型定义', null, '192.168.2.202', '192.168.2.202', 'a', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956301', 'FUNCGROUP1499956152', 'FUN020221', '角色管理', null, '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956302', 'FUNCGROUP1499956153', 'FUNc101', '操作员管理', null, '192.168.2.202', '操作员管理', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956303', 'FUNCGROUP1499956153', 'FUN1001', '个性化配置', null, '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956304', 'FUNCGROUP1499956153', 'FUN0c001', '重组菜单', null, '192.168.2.202', '192.168.2.202', 's', 'n', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956308', 'FUNCGROUP1499956153', 'FUN0011', '快捷菜单', null, '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956309', 'FUNCGROUP1499956153', 'FUN10010', '操作员身份', null, '192.168.2.202', '192.168.2.202', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956310', 'FUNCGROUP1499956154', 'FUN1010', '业务字典管理', null, '192.168.3.302', '192.168.3.302', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1499956311', 'FUNCGROUP1499956154', 'FUNS001', '序号资源表管理', null, '192.168.3.303', '192.168.3.303', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500075347', 'FUNCGROUP1500075305', '3213', '321312', '323123', '3123213', '21312321', 's', 'y', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500075349', 'FUNCGROUP1500075305', '123123', '323', '13123', '32131231312312', '1231231123', 's', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500075357', 'FUNCGROUP1500075310', '3123123', '测试', '123123', '312321', '3123213', 's', 'y', 'n');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601486', 'FUNCGROUP1500544715', 'Fun_001', '组织机构', '组织机构页面管理', '192.168.2.202', '192.168.2.202', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601487', 'FUNCGROUP1500544715', 'Fun_002', '员工管理', '员工管理页面', '192.168.2.202', '192.168.2.202', '0', 'n', 'N');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601488', 'FUNCGROUP1500544715', 'Fun_003', '业务机构', '业务机构页面', '1231231', '1231231', '0', 'n', 'N');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601505', 'FUNCGROUP1500544715', 'FUN_004', '工作组', '3213213', '321321312', '3213123321321', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601528', 'FUNCGROUP1500544715', 'FUN_005', '职务定义', '职务定义的页面描述', '192.168.2.202', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601529', 'FUNCGROUP1500544716', 'Auth001', '应用功能管理', '应用功能管理页面描述', 'Auth001', '192.168.2.202', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601530', 'FUNCGROUP1500544716', 'Menu001', '菜单管理', '菜单管理的描述', '1231231', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601531', 'FUNCGROUP1500544716', 'FUNQ001', '数据形体管理', '数据形体管理的描述', '192.168.2.202', '192.168.2.202', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601532', 'FUNCGROUP1500544716', 'FUNQ002', '数据范围管理', '数据范围管理的页面', '192.168.2.202', '8090', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601534', 'FUNCGROUP1500544716', 'FUNQ003', '功能行为类型定义', '功能行为类型定义', '1231231', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601535', 'FUNCGROUP1500544716', 'FUNQ004', '角色管理', '角色管理角色管理角色管理角色管理角色管理', '192.168.2.202', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601536', 'FUNCGROUP1500544717', 'FUNC001', '操作员管理', '操作员管理的描述测试', '1231231', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601537', 'FUNCGROUP1500544717', 'FUNC002', '重组菜单', '重组菜单的描述测试', '1231231', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601538', 'FUNCGROUP1500544717', 'FUNC004', '特殊权限', '特殊权限的页面描述', '1231231', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601539', 'FUNCGROUP1500544717', 'FUNC005', '操作员身份', '操作员身份的描述', '192.168.2.202', '8090', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601540', 'FUNCGROUP1500544718', 'FUNQ', '业务字典', '业务字典的描述', '192.168.2.202', '192.168.2.202', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1500601543', 'FUNCGROUP1500544718', 'FUNQ0001', '序号资源表管理', '序号资源表管理的描述', '1231231', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1502354964', 'FUNCGROUP1500544718', 'FUN0101', '系统运行参数', '系统运行参数', '1231231', '1231231', '0', 'n', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1503023965', 'FUNCGROUP1502847469', 'Fun0012312', '测试功能123', '31231', '31231', '1312', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1503023966', 'FUNCGROUP1503036148', '查出', '猜测是功能', '132132', '13123', '33213', 's', 'n', 's');
INSERT INTO `AC_FUNC` VALUES ('FUNC1504581747', 'FUNCGROUP1500544718', 'FUN_timer', '定时器功能', '定时器管理的描述', '192.168.2.202', '11', '0', 'Y', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1504777570', 'FUNCGROUP1504777547', 'FUN01001', '测试功能是否成功', '231', '192.168.2.202', '12312', '0', 'Y', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1504777571', 'FUNCGROUP1504777548', '测试功能123', '测试功能123', '1231231', '1323', '123123', '0', 'Y', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1504777572', 'FUNCGROUP1504777549', '测试赛1312', '测试赛1312', '13123123', '231231', '23123123', '0', 'Y', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1504777573', 'FUNCGROUP1504777550', 'FUNtes', '测试功能', '测试功能的描述', '192.168.2.202', '193.3.302.202', '0', 'Y', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1504890587', 'FUNCGROUP1500544718', 'FUNlog', '日志管理', '日志管理', '192.168.2.202', '10', '0', 'Y', 'Y');
INSERT INTO `AC_FUNC` VALUES ('FUNC1504890589', 'FUNCGROUP1505021734', 'fun00132131231', '测试个表', '331231', '32131', '2312312', '0', 'Y', 'Y');



INSERT INTO `AC_BHVTYPE_DEF` VALUES ('BHVTYPEDEF1499784150', 'common', '通用类');
INSERT INTO `AC_BHVTYPE_DEF` VALUES ('BHVTYPEDEF1499784153', 'query', '查询类');
INSERT INTO `AC_BHVTYPE_DEF` VALUES ('BHVTYPEDEF1499784155', 'manage', '维护类');
INSERT INTO `AC_BHVTYPE_DEF` VALUES ('BHVTYPEDEF1500076791', 'account', '账务类');


INSERT INTO `AC_BHV_DEF` VALUES ('111', '11', null, null);
INSERT INTO `AC_BHV_DEF` VALUES ('222', '11', null, null);
INSERT INTO `AC_BHV_DEF` VALUES ('333', '11', null, null);
INSERT INTO `AC_BHV_DEF` VALUES ('444', '11', null, null);
INSERT INTO `AC_BHV_DEF` VALUES ('555', '11', null, null);
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1499958630', 'FUNC1499440080', 'p', '12313');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011689', 'BHVTYPEDEF1499784150', 'default-tx', '通用');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011690', 'BHVTYPEDEF1499784150', 'driver-tx', '启动交易');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011691', 'BHVTYPEDEF1499784150', 'hold-tx', '暂存');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011692', 'BHVTYPEDEF1499784150', 'commit-tx', '提交');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011693', 'BHVTYPEDEF1499784150', 'type-in', '补录');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011694', 'BHVTYPEDEF1499784150', 'commit-ag', '再提交');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011695', 'BHVTYPEDEF1499784150', 'cancel-tx', '取消');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011696', 'BHVTYPEDEF1499784150', 'delete-tx', '删除');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011697', 'BHVTYPEDEF1499784150', 're-print', '补打');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011698', 'BHVTYPEDEF1499784150', 'copy-tx', '复制');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011699', 'BHVTYPEDEF1499784153', 'r-detail', '记录查询');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011700', 'BHVTYPEDEF1499784153', 'r-file', '文件查询(大查询)');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011701', 'BHVTYPEDEF1499784154', 'reverse-tx', '冲正');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011702', 'BHVTYPEDEF1499784155', 'query', '查询');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011703', 'BHVTYPEDEF1499784155', 'add', '新增');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011704', 'BHVTYPEDEF1499784155', 'delete', '删除');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500011705', 'BHVTYPEDEF1499784155', 'update', '修改');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500076783', 'BHVTYPEDEF1500076765', 'reverse-tx1', '冲正');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500076784', 'BHVTYPEDEF1500076766', '3', '312');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500076789', 'BHVTYPEDEF1500076785', '12', '321');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500076790', 'BHVTYPEDEF1500076789', '3213123', '321');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500076791', 'BHVTYPEDEF1500076789', 'reverse-tx', '冲正');
INSERT INTO `AC_BHV_DEF` VALUES ('BHVDEF1500076792', 'BHVTYPEDEF1500076791', 'reverse-tx', '冲正');





INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017963', 'FUNC1499925316', 'BHVDEF1500011692', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017964', 'FUNC1499925316', 'BHVDEF1500011693', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017965', 'FUNC1499925316', 'BHVDEF1500011694', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017966', 'FUNC1499925316', 'BHVDEF1500011690', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017967', 'FUNC1499925316', 'BHVDEF1500011697', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017968', 'FUNC1499925316', 'BHVDEF1500011698', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017969', 'FUNC1499925316', 'BHVDEF1500011696', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017970', 'FUNC1499925316', 'BHVDEF1500011691', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017971', 'FUNC1499925316', 'BHVDEF1500011699', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017972', 'FUNC1499925316', 'BHVDEF1500011700', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017973', 'FUNC1499925316', 'BHVDEF1500011701', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017974', 'FUNC1499925316', 'BHVDEF1500011702', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017975', 'FUNC1499925316', 'BHVDEF1500011704', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017976', 'FUNC1499925316', 'BHVDEF1500011703', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017977', 'FUNC1499925316', 'BHVDEF1500011705', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017978', 'FUNC1499130418', 'BHVDEF1500011689', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017979', 'FUNC1499130418', 'BHVDEF1500011690', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017980', 'FUNC1499130418', 'BHVDEF1500011693', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017981', 'FUNC1499130418', 'BHVDEF1500011694', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500017982', 'FUNC1499130418', 'BHVDEF1500011698', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500020903', 'FUNC1499925316', 'BHVDEF1500011689', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045569', 'FUNC1499956281', 'BHVDEF1500011691', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045573', 'FUNC1499956281', 'BHVDEF1500011695', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045574', 'FUNC1499956281', 'BHVDEF1500011696', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045575', 'FUNC1499956281', 'BHVDEF1500011697', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045578', 'FUNC1499956281', 'BHVDEF1500011700', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045580', 'FUNC1499956281', 'BHVDEF1500011702', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045581', 'FUNC1499956281', 'BHVDEF1500011703', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045582', 'FUNC1499956281', 'BHVDEF1500011704', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045583', 'FUNC1499956281', 'BHVDEF1500011705', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045584', 'FUNC1499956281', 'BHVDEF1500011701', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045602', 'FUNC1500075333', 'BHVDEF1500011689', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045603', 'FUNC1500075333', 'BHVDEF1500011690', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045604', 'FUNC1500075333', 'BHVDEF1500011691', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045605', 'FUNC1500075333', 'BHVDEF1500011692', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045606', 'FUNC1500075333', 'BHVDEF1500011693', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045607', 'FUNC1500075333', 'BHVDEF1500011694', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045608', 'FUNC1500075333', 'BHVDEF1500011695', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045609', 'FUNC1500075333', 'BHVDEF1500011696', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045610', 'FUNC1500075333', 'BHVDEF1500011697', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045611', 'FUNC1500075333', 'BHVDEF1500011698', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045629', 'FUNC1500075336', 'BHVDEF1500011689', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045630', 'FUNC1500075336', 'BHVDEF1500011690', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045631', 'FUNC1500075336', 'BHVDEF1500011691', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045632', 'FUNC1500075336', 'BHVDEF1500011692', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045633', 'FUNC1500075336', 'BHVDEF1500011693', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045634', 'FUNC1500075336', 'BHVDEF1500011694', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045635', 'FUNC1500075336', 'BHVDEF1500011695', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045636', 'FUNC1500075336', 'BHVDEF1500011696', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045637', 'FUNC1500075336', 'BHVDEF1500011697', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045638', 'FUNC1500075336', 'BHVDEF1500011698', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045641', 'FUNC1500075336', 'BHVDEF1500011702', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045642', 'FUNC1500075336', 'BHVDEF1500011703', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045643', 'FUNC1500075336', 'BHVDEF1500011704', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045644', 'FUNC1500075336', 'BHVDEF1500011705', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045645', 'FUNC1500075336', 'BHVDEF1500076792', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045646', 'FUNC1500075340', 'BHVDEF1500011689', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045647', 'FUNC1500075340', 'BHVDEF1500011690', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045648', 'FUNC1500075340', 'BHVDEF1500011691', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045649', 'FUNC1500075340', 'BHVDEF1500011692', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045650', 'FUNC1500075340', 'BHVDEF1500011693', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045651', 'FUNC1500075340', 'BHVDEF1500011694', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045652', 'FUNC1500075340', 'BHVDEF1500011695', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045653', 'FUNC1500075340', 'BHVDEF1500011696', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045654', 'FUNC1500075340', 'BHVDEF1500011697', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500045655', 'FUNC1500075340', 'BHVDEF1500011698', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500510337', 'FUNC1499956302', 'BHVDEF1500011702', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500510338', 'FUNC1499956302', 'BHVDEF1500011703', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500510339', 'FUNC1499956302', 'BHVDEF1500011704', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500510340', 'FUNC1499956302', 'BHVDEF1500011705', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500510341', 'FUNC1499956302', 'BHVDEF1500011699', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500510342', 'FUNC1499956302', 'BHVDEF1500011700', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601528', 'FUNC1500601486', 'BHVDEF1500076792', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601529', 'FUNC1500601486', 'BHVDEF1500011702', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601530', 'FUNC1500601486', 'BHVDEF1500011703', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601532', 'FUNC1500601486', 'BHVDEF1500011705', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601534', 'FUNC1500601486', 'BHVDEF1500011700', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601535', 'FUNC1500601535', 'BHVDEF1500011689', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601536', 'FUNC1500601535', 'BHVDEF1500011690', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601537', 'FUNC1500601535', 'BHVDEF1500011691', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601538', 'FUNC1500601535', 'BHVDEF1500011692', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601539', 'FUNC1500601535', 'BHVDEF1500011693', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601541', 'FUNC1500601535', 'BHVDEF1500011695', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601542', 'FUNC1500601535', 'BHVDEF1500011696', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601543', 'FUNC1500601535', 'BHVDEF1500011697', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500601544', 'FUNC1500601535', 'BHVDEF1500011698', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860014', 'FUNC1500601488', 'BHVDEF1500011689', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860015', 'FUNC1500601488', 'BHVDEF1500011690', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860016', 'FUNC1500601488', 'BHVDEF1500011691', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860017', 'FUNC1500601488', 'BHVDEF1500011692', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860018', 'FUNC1500601488', 'BHVDEF1500011693', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860019', 'FUNC1500601488', 'BHVDEF1500011694', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860020', 'FUNC1500601488', 'BHVDEF1500011695', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860021', 'FUNC1500601488', 'BHVDEF1500011696', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860022', 'FUNC1500601488', 'BHVDEF1500011697', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1500860023', 'FUNC1500601488', 'BHVDEF1500011698', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1502467714', 'FUNC1500601535', 'BHVDEF1500076792', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1503047140', 'FUNC1503047105', 'BHVDEF1500011704', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1503047141', 'FUNC1503047105', 'BHVDEF1500011705', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1504164753', 'FUNC1500601487', 'BHVDEF1500011702', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1504164754', 'FUNC1500601487', 'BHVDEF1500011703', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1504164755', 'FUNC1500601487', 'BHVDEF1500011704', 'Y');
INSERT INTO `AC_FUNC_BHV` VALUES ('FUNCBHV1504164756', 'FUNC1500601487', 'BHVDEF1500011705', 'Y');


INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499074823', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130403', ' \r\nBHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130403', ' \r\nBHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499925316', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499925316', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('1', '22');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499925316', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499925316', 'BHVTYPEDEF1499784154');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499925316', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130403', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130403', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130403', 'BHVTYPEDEF1499784154');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130403', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130418', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130418', 'BHVTYPEDEF1499784154');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130405', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130405', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130405', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130405', 'BHVTYPEDEF1499784154');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130406', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130406', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499130418', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499956281', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499956281', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499956281', 'BHVTYPEDEF1499784154');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499956281', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075333', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075333', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075333', 'BHVTYPEDEF1499784154');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075333', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075336', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075336', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075336', 'BHVTYPEDEF1500076791');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075336', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500075340', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499956302', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1499956302', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500516464', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500516464', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500516464', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500516464', 'BHVTYPEDEF1500076791');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601486', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601486', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601486', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601486', 'BHVTYPEDEF1500076791');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601535', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601535', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601535', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601535', 'BHVTYPEDEF1500076791');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601488', 'BHVTYPEDEF1499784150');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601488', 'BHVTYPEDEF1499784153');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601488', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601488', 'BHVTYPEDEF1500076791');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1503047105', 'BHVTYPEDEF1499784155');
INSERT INTO `AC_FUNC_BHVTYPE` VALUES ('FUNC1500601487', 'BHVTYPEDEF1499784155');


INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499440080', 'p', '12313', '12313', '123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499440081', 'p', '3', '32131', '213123123123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499440082', 'p', '1231231', '1', '1');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499440083', 'p', '1231231', '1', '111');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499440084', 'p', '1231231', '112', '12312311');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499440085', 'p', '1231231', '1', '1231231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499757174', 'p', '2313123', '312321', '231231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499757175', 'p', '321312', '1231231', '1231231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499757176', 'p', '1313123', '3321312312', '312123123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925307', 'l', '功能测试接口', '功能测试接口', '功能测试接口');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925308', 'p', '32131', '32232', '2321321');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925309', 'p', '43432', '4343', '2343');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925310', 'p', '35345', '543', '5454');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925311', 'p', '3423', '43234', '42342');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925312', 'l', '4324', '3432', '432432');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925313', 'p', '423423', '4324234', '34');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925314', 'p', '321312', '3', '23123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925315', 'p', '31232', '3123123', '123123123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499925316', 'p', '3123', '321312', '33213');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956280', 'p', '192.138.3.202', 'ceshi', '测试');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956281', 'p', '#/abftree.html', '组织机构管理', '组织机构管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956291', 'p', '#/Emp.html', '员工管理', '员工管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956292', 'l', '#/zanding.html', '业务机构', '业务机构');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956293', 'p', '#/Workgroup.html', '192.168.2.202', '工作组');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956294', 'p', '#/zanding.html', '职务定义', '职务定义');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956295', 'p', '#/applicationFun.html', '应用功能管理', '应用功能管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956296', 'p', '#/menuManagement.html', '菜单管理', '菜单管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956297', 'p', '#/behavior.html', '功能行为类型定义', '功能行为类型定义');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956301', 'p', '#/roleManagement.html', '角色管理', '角色管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956302', 'p', '#/opManage.html', '操作员管理', '操作员管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956303', 'p', '#/roleConfig.html', '个性化配置', '个性化配置');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956304', 'p', '#/Reorganizemenu.html', '重组菜单', '重组菜单');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956308', 'p', '#/shortcutMenu.html', '快捷菜单', '快捷菜单');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956309', 'p', '#/operstatus.html', '操作员身份', '操作员身份');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956310', 'p', '#/dictionary.html', '业务字典管理', '业务字典管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1499956311', 'p', '#/numberResources.html', '序号资源表管理', '序号资源表管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075330', 'p', '#/Emp.html', '测试功能', '测试功能');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075331', 'p', '1231231', '1231231', '1231231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075332', 'p', '1312', '1', '3213213');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075333', 'p', '312', '3213', '2132131231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075334', 'j', '312313123', '31232', '21312');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075335', 'p', '测试0032', '测试0032', '测试0032');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075336', 'p', '1231231', '1231231', '1231231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075337', 'p', 'applicationRService.createAcFunc', 'applicationRService.createAcFunc', 'applicationRService.createAcFunc');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075338', 'p', '测试', '测试', '测试3123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075339', 'p', '123123213', '321312', '312323');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075340', 'p', '31231', '312313', '32132');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075342', 'p', '1231231', '1231231', '1231231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075343', 'p', '测试是佛uweikomng', '测试是佛uweikomng', '测试是佛uweikomng');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075344', 'p', '测试是我否我I空', '测试是我否我I空', '测试是我否我I空');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075345', 'p', '测试功能是否展现', '测试功能是否展现', '测试功能是否展现');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075346', 'l', '312321', '3123123', '2312312');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075347', 'p', '12321312', '3123', '213123123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075349', 'l', '1312312', '312312', '3123123123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075350', 'p', '123123', '1321', '3123123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075351', 'p', '21312', '31321', '213123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075355', 'p', '21321', '321312', '3213');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075356', 'p', '1311', '31231', '2313123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075357', 'p', '312', '321321', '1231231312');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500075358', 'p', '1231', '321312', '313123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500516463', 'p', '1231231', '321312', '312312312');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500516464', 'p', '3213213', '323213', '12312312321312');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601486', 'jsp', '#/abftree.html', '组织机构管理', '组织机构');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601487', 'pageflow', '#/Emp.html', '员工管理', '员工管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601488', 'pageflow', '业务机构', '组织机构管理', '业务机构');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601505', 'jsp', '工作组', '工作组', '工作组');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601528', 'workflow', 'javascript:;', '组织机构管理', '职务定义');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601529', 'p', '#/applicationFun.html', '权限管理', '应用功能管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601530', 'p', '#/menuManagement.html', '权限管理', '菜单管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601531', 'p', 'javascript:;', '权限管理', '数据形体管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601532', 'p', 'javascript::', '权限管理', '数据范围管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601533', 'p', '#/roleManagement.html', '权限管理', '角色管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601534', 'p', '#/behavior.html', '权限管理', '功能行为类型定义');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601535', 'p', '#/roleManagement.html', '权限管理', '角色管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601536', 'p', '#/opManage.html', '操作员管理', '操作员管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601537', 'p', '#/Reorganizemenu.html', '操作员管理', '重组菜单');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601538', 'p', 'javascript:;', '操作员管理', '特殊权限');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601539', 'p', '#/operstatus.html', '操作员管理', '操作员身份');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601540', 'p', '#/dictionary.html', '其他管理', '业务字典');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1500601543', 'p', '#/numberResources.html', '其他管理', '序号资源表管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1502354964', 'p', '1', '1', '系统运行参数');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1503023965', 'p', '1', '1', '1231231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1503023966', 'p', '12323', '312', '3123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1503023968', 'p', '1231231', '12312', '3123');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1503047105', 'p', '3131311123123', '312', '312313131');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1504581747', 'pageflow', 'transtimeer.html', null, '定时器功能');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1504777570', 'jsp', '3123', '12312', '31231');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1504777571', 'jsp', '1233', '3123', '123213');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1504777572', 'jsp', '2312312', '123', '231233');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1504777573', 'pageflow', 'applicationFun.html', 'test', 'test');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1504890587', 'jsp', 'journal.html', '日志管理', '日志管理');
INSERT INTO `AC_FUNC_RESOURCE` VALUES ('FUNC1504890589', 'jsp', '2312', '312', '32131');



