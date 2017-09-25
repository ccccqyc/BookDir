# 理解JavaFX架构

在JavaFX公开的API之下JavaFX代码运行引擎。它由几大部分组成：一个JavaFX 
高性能图形引擎，名为Prism；一个简洁高效的窗体系统，名为Glass；一个媒体引擎；一个web引擎。尽管这些组件并没有公开对外暴露，但是下面的描述将有助于你理解一个JavaFX应用是如何运行的。

- 场景图(Scene Graph)
- JavaFX功能的公开API(Java Public APIs for JavaFX Features)
- 图形系统(Graphics System)
- Glass窗体工具包(Glass Windowing Toolkit)
- 多媒体和图像(Media and Images)
- Web组件(Web Component)
- CSS
- UI控件(UI Controls)
- 布局(Layout)
- 2-D和3-D转换(2-D and 3-D Transformations)
- 视觉特效(Visual Effects)

![JavaFX架构](../image/JavaFX架构.png)

Java FX平台的组件架构

---

Reference:[JavaFX架构](http://www.javafxchina.net/blog/2015/06/doc01_architecture/)