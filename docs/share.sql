drop table if exists SYS_BUTTON;

drop table if exists SYS_MENU;

drop table if exists SYS_MENU_BUTTON;

drop table if exists SYS_ORGANIZATION;

drop table if exists SYS_PRIVILEGE;

drop table if exists SYS_ROLE;

drop table if exists SYS_USER;

drop table if exists SYS_USER_ORG;

drop table if exists SYS_USER_ROLE;

/*==============================================================*/
/* Table: SYS_BUTTON                                            */
/*==============================================================*/
create table SYS_BUTTON
(
   ID                   int unsigned auto_increment not null comment '主键',
   MENU_ID              int comment '菜单ID',
   ICON                 varchar(50) comment '图标',
   ACRO                 varchar(100) comment '标识',
   SEQ                  int comment '序号',
   CREATED_USER_ID      varchar(20) comment '创建人ID',
   CREATED_USER_NAME    varchar(50) comment '创建人姓名',
   CREATED_DATE         date comment '创建时间',
   UPDATE_USER_ID       varchar(20) comment '修改人ID',
   UPDATE_USER_NAME     varchar(50) comment '修改人姓名',
   UPDATE_DATE          date comment '修改时间',
   primary key (ID)
);

alter table SYS_BUTTON comment '按钮表';

/*==============================================================*/
/* Table: SYS_MENU                                              */
/*==============================================================*/
create table SYS_MENU
(
   ID                   int unsigned auto_increment not null comment '主键',
   NAME                 varchar(200) comment '名称',
   PARENT_ID            int comment '父级ID',
   URL                  varchar(100) comment 'URL',
   ICON                 varchar(50) comment '图标',
   ACRO                 varchar(100) comment '标识',
   IS_LEAF              char(2) comment '叶子节点',
   SEQ                  int comment '序号',
   CREATED_USER_ID      varchar(20) comment '创建人ID',
   CREATED_USER_NAME    varchar(50) comment '创建人姓名',
   CREATED_DATE         date comment '创建时间',
   UPDATE_USER_ID       varchar(20) comment '修改人ID',
   UPDATE_USER_NAME     varchar(50) comment '修改人姓名',
   UPDATE_DATE          date comment '修改时间',
   primary key (ID)
);

alter table SYS_MENU comment '菜单表';

/*==============================================================*/
/* Table: SYS_MENU_BUTTON                                       */
/*==============================================================*/
create table SYS_MENU_BUTTON
(
   ID                   int unsigned auto_increment not null comment '主键',
   MENU_ID              int comment '菜单ID',
   BTN_ID               int comment '按钮ID',
   primary key (ID)
);

alter table SYS_MENU_BUTTON comment '菜单-按钮表';

/*==============================================================*/
/* Table: SYS_ORGANIZATION                                      */
/*==============================================================*/
create table SYS_ORGANIZATION
(
   ID                   int unsigned auto_increment not null comment '主键',
   NAME                 varchar(200) comment '名称',
   PARENT_ID            varchar(20) comment '父级ID',
   GRADE                int comment '层级',
   ICON                 varchar(50) comment '图标',
   SEQ                  int comment '序号',
   CREATED_USER_ID      varchar(20) comment '创建人ID',
   CREATED_USER_NAME    varchar(50) comment '创建人姓名',
   CREATED_DATE         date comment '创建时间',
   UPDATE_USER_ID       varchar(20) comment '修改人ID',
   UPDATE_USER_NAME     varchar(50) comment '修改人姓名',
   UPDATE_DATE          date comment '修改时间',
   primary key (ID)
);

alter table SYS_ORGANIZATION comment '组织机构表';

/*==============================================================*/
/* Table: SYS_PRIVILEGE                                         */
/*==============================================================*/
create table SYS_PRIVILEGE
(
   ID                   int unsigned auto_increment not null comment '主键',
   MASTER_ID            int comment '主体ID',
   RESOURCE_ID          int comment '资源ID',
   STATUS               char(4) comment '状态',
   primary key (ID)
);

alter table SYS_PRIVILEGE comment '权限表';

/*==============================================================*/
/* Table: SYS_ROLE                                              */
/*==============================================================*/
create table SYS_ROLE
(
   ID                   int unsigned auto_increment not null comment '主键',
   NAME                 varchar(200) comment '名称',
   MEMO                 varchar(500) comment '备注',
   CREATED_USER_ID      varchar(20) comment '创建人ID',
   CREATED_USER_NAME    varchar(50) comment '创建人姓名',
   CREATED_DATE         date comment '创建时间',
   UPDATE_USER_ID       varchar(20) comment '修改人ID',
   UPDATE_USER_NAME     varchar(50) comment '修改人姓名',
   UPDATE_DATE          date comment '修改时间',
   primary key (ID)
);

alter table SYS_ROLE comment '角色表';

/*==============================================================*/
/* Table: SYS_USER                                              */
/*==============================================================*/
create table SYS_USER
(
   ID                   int unsigned auto_increment not null comment '主键',
   USERNAME             varchar(50) comment '用户名',
   PASSWORD             varchar(50) comment '密码',
   SALT                 varchar(20) comment 'SALT',
   REAL_NAME            varchar(50) comment '真实',
   SEX                  varchar(10) comment '性别',
   BIRTHDAY             date comment '出生日期',
   PHONE                varchar(20) comment '手机号',
   EMAIL                varchar(50) comment '邮箱',
   DEGREE               char(2) comment '文化程度',
   ADRESS               varchar(200) comment '家庭住址',
   CREATED_USER_ID      varchar(20) comment '创建人ID',
   CREATED_USER_NAME    varchar(50) comment '创建人姓名',
   CREATED_DATE         date comment '创建时间',
   UPDATE_USER_ID       varchar(20) comment '修改人ID',
   UPDATE_USER_NAME     varchar(50) comment '修改人姓名',
   UPDATE_DATE          date comment '修改时间',
   primary key (ID)
);

alter table SYS_USER comment '用户表';

/*==============================================================*/
/* Table: SYS_USER_ORG                                          */
/*==============================================================*/
create table SYS_USER_ORG
(
   ID                   int unsigned auto_increment not null comment '主键',
   USER_ID              int comment '用户ID',
   ORG_ID               int comment '机构ID',
   primary key (ID)
);

alter table SYS_USER_ORG comment '用户-机构表';

/*==============================================================*/
/* Table: SYS_USER_ROLE                                         */
/*==============================================================*/
create table SYS_USER_ROLE
(
   ID                   int unsigned auto_increment not null comment '主键',
   USER_ID              int comment '用户ID',
   ROLE_ID              int comment '角色ID',
   primary key (ID)
);

alter table SYS_USER_ROLE comment '用户-角色表';

alter table SYS_MENU_BUTTON add constraint FK_Reference_5 foreign key (MENU_ID)
      references SYS_MENU (ID) on delete restrict on update restrict;

alter table SYS_MENU_BUTTON add constraint FK_Reference_6 foreign key (BTN_ID)
      references SYS_BUTTON (ID) on delete restrict on update restrict;

alter table SYS_PRIVILEGE add constraint FK_Reference_10 foreign key (RESOURCE_ID)
      references SYS_MENU (ID) on delete restrict on update restrict;

alter table SYS_PRIVILEGE add constraint FK_Reference_11 foreign key (RESOURCE_ID)
      references SYS_BUTTON (ID) on delete restrict on update restrict;

alter table SYS_PRIVILEGE add constraint FK_Reference_7 foreign key (MASTER_ID)
      references SYS_ORGANIZATION (ID) on delete restrict on update restrict;

alter table SYS_PRIVILEGE add constraint FK_Reference_8 foreign key (MASTER_ID)
      references SYS_USER (ID) on delete restrict on update restrict;

alter table SYS_PRIVILEGE add constraint FK_Reference_9 foreign key (MASTER_ID)
      references SYS_ROLE (ID) on delete restrict on update restrict;

alter table SYS_USER_ORG add constraint FK_Reference_1 foreign key (ORG_ID)
      references SYS_ORGANIZATION (ID) on delete restrict on update restrict;

alter table SYS_USER_ORG add constraint FK_Reference_2 foreign key (USER_ID)
      references SYS_USER (ID) on delete restrict on update restrict;

alter table SYS_USER_ROLE add constraint FK_Reference_3 foreign key (USER_ID)
      references SYS_USER (ID) on delete restrict on update restrict;

alter table SYS_USER_ROLE add constraint FK_Reference_4 foreign key (ROLE_ID)
      references SYS_ROLE (ID) on delete restrict on update restrict;
