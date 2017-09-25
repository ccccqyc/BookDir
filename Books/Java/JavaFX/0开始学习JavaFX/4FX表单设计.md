在开发应用程序时，创建一个表单是一种很常见的活动。本教程介绍屏幕布局(Layout)的基本信息，指导你如何添加控件到Layout面板( Pane)中，如何创建输入事件。

1.初始化工程

- 继承 Application , Override 方法start
- main方法调用lunch(args)

2.创建GridPane Layout

- 类GridPane布局表单(行,列结构)
- 属性setXX(Alignment-显示位置,Hgap-行间隔,Vgap-列间隔,Padding-grid面板四周边缘间隔,
- Scene构造函数,使用grid作为root节点Scene(grid,300,600);

3.文本(Text),标签(Label),文本域(Text Field) (添加在padding属性后)

- Text 构造函数创建不可变对象
- Text属性,setFont,然后添加到grid布局中
- Label类,TextField文本框,PassWordField框

4.按钮(Button)

- Button构造函数,String参数,创建自带标签的Button

  ​