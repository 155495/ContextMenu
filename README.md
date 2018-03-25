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
![output-of-floating-android-context-popup-menu-example](https://user-images.githubusercontent.com/36828976/37878838-7e9713c6-308c-11e8-8b15-7cddd9538441.gif)


### Context menu and contextual action mode
A context menu is a floating menu that appears when the user performs a long-click on an element. It provides actions that affect the selected content or context frame.
The contextual action mode displays action items that affect the selected content in a bar at the top of the screen and allows the user to select multiple items.
*******************************************************************************************
#### menu.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/new_game"
          android:icon="@drawable/ic_new_game"
          android:title="@string/new_game"
          android:showAsAction="ifRoom"/>
    <item android:id="@+id/help"
          android:icon="@drawable/ic_help"
          android:title="@string/help" />
</menu>
```
**************************************************************************************
#### MainActivity.java
``` javascript
@Override
public void onCreateContextMenu(ContextMenu menu, View v,
                                ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.context_menu, menu);
}
```
*********************************************************************************
```javascript
@Override
public boolean onContextItemSelected(MenuItem item) {
    AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();
    switch (item.getItemId()) {
        case R.id.edit:
            editNote(info.id);
            return true;
        case R.id.delete:
            deleteNote(info.id);
            return true;
        default:
            return super.onContextItemSelected(item);
    }
}
```
