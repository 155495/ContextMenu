# ContextMenu
Menus
In this document Defining a Menu in XML Creating an Options Menu
Handling click events Changing menu items at runtime Creating Contextual Menus Creating a floating context menu
Using the contextual action mode Creating a Popup Menu Handling click events Creating Menu Groups Using checkable menu items Adding Menu Items Based on an Intent Allowing your activity to be added to other menus
Key classes
Menu
MenuItem
ContextMenu
ActionMode
See also
Adding the App Bar
Menu Resource
Say Goodbye to the Menu Button
Menus are a common user interface component in many types of applications. To provide a familiar and consistent user experience, you should use the Menu APIs to present user actions and other options in your activities.

Beginning with Android 3.0 (API level 11), Android-powered devices are no longer required to provide a dedicated Menu button. With this change, Android apps should migrate away from a dependence on the traditional 6-item menu panel and instead provide an app bar to present common user actions.

Although the design and user experience for some menu items have changed, the semantics to define a set of actions and options is still based on the Menu APIs. This guide shows how to create the three fundamental types of menus or action presentations on all versions of Android
## Screen Shot
