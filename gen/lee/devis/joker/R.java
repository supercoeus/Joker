/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package lee.devis.joker;

public final class R {
    public static final class anim {
        public static final int bottomitem_in=0x7f040000;
        public static final int topitem_in=0x7f040001;
    }
    public static final class attr {
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 
 Example customization of dimensions originally defined in res/values/dimens.xml
         (such as screen margins) for screens with more than 820dp of available width. This
         would include 7" and 10" devices in landscape (~960dp and ~1280dp respectively). 
         */
        public static final int activity_horizontal_margin=0x7f050000;
        public static final int activity_vertical_margin=0x7f050001;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
        public static final int joke=0x7f020001;
        public static final int menu_background=0x7f020002;
        public static final int menu_contact=0x7f020003;
        public static final int menu_native=0x7f020004;
        public static final int menu_net=0x7f020005;
        public static final int start_menu_btn=0x7f020006;
        public static final int start_menu_btn_pressed=0x7f020007;
    }
    public static final class id {
        public static final int content=0x7f08000b;
        public static final int icon=0x7f080009;
        public static final int image=0x7f08000c;
        public static final int imageView=0x7f080006;
        public static final int loading=0x7f080007;
        public static final int mPathView=0x7f080005;
        public static final int name=0x7f08000a;
        public static final int pagertab=0x7f080004;
        /**  最热 
         */
        public static final int tag_get_hot=0x7f080001;
        /**  最新 
         */
        public static final int tag_get_newest=0x7f080000;
        /**  有图 
         */
        public static final int tag_get_picture=0x7f080002;
        public static final int time=0x7f08000d;
        public static final int viewpager=0x7f080003;
        public static final int zListView=0x7f080008;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int activity_showpic=0x7f030001;
        public static final int activity_welcome=0x7f030002;
        public static final int fragment_hot=0x7f030003;
        public static final int fragment_newest=0x7f030004;
        public static final int fragment_picture=0x7f030005;
        public static final int joke_item=0x7f030006;
    }
    public static final class string {
        public static final int action_settings=0x7f060002;
        public static final int app_name=0x7f060000;
        public static final int hello_blank_fragment=0x7f060003;
        public static final int hello_world=0x7f060001;
    }
    public static final class style {
        /** 
        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f070002;
        /**  Base application theme. 
 Customize your theme here. 
         */
        public static final int AppTheme=0x7f070000;
        /**  //1、设置背景图Theme 
 <style name="Theme.AppStartLoad" parent="android:Theme"> 
 <item name="android:windowBackground">@drawable/ipod_bg</item> 
 <item name="android:windowNoTitle">true</item> 
 </style> 
         */
        public static final int Theme_AppStartLoadTranslucent=0x7f070001;
    }
    public static final class styleable {
        /** Attributes that can be used with a ListView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ListView_android_divider android:divider}</code></td><td> Drawable or color to draw between list items.</td></tr>
           <tr><td><code>{@link #ListView_android_dividerHeight android:dividerHeight}</code></td><td> Height of the divider.</td></tr>
           <tr><td><code>{@link #ListView_android_entries android:entries}</code></td><td> Reference to an array resource that will populate the ListView.</td></tr>
           <tr><td><code>{@link #ListView_android_footerDividersEnabled android:footerDividersEnabled}</code></td><td> When set to false, the ListView will not draw the divider before each footer view.</td></tr>
           <tr><td><code>{@link #ListView_android_headerDividersEnabled android:headerDividersEnabled}</code></td><td> When set to false, the ListView will not draw the divider after each header view.</td></tr>
           <tr><td><code>{@link #ListView_android_overScrollFooter android:overScrollFooter}</code></td><td> Drawable to draw below list content.</td></tr>
           <tr><td><code>{@link #ListView_android_overScrollHeader android:overScrollHeader}</code></td><td> Drawable to draw above list content.</td></tr>
           </table>
           @see #ListView_android_divider
           @see #ListView_android_dividerHeight
           @see #ListView_android_entries
           @see #ListView_android_footerDividersEnabled
           @see #ListView_android_headerDividersEnabled
           @see #ListView_android_overScrollFooter
           @see #ListView_android_overScrollHeader
         */
        public static final int[] ListView = {
            0x010100b2, 0x01010129, 0x0101012a, 0x0101022e,
            0x0101022f, 0x010102c2, 0x010102c3
        };
        /**
          <p>
          @attr description
           Drawable or color to draw between list items. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#divider}.
          @attr name android:divider
        */
        public static final int ListView_android_divider = 1;
        /**
          <p>
          @attr description
           Height of the divider. Will use the intrinsic height of the divider if this
             is not specified. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#dividerHeight}.
          @attr name android:dividerHeight
        */
        public static final int ListView_android_dividerHeight = 2;
        /**
          <p>
          @attr description
           Reference to an array resource that will populate the ListView.  For static content,
             this is simpler than populating the ListView programmatically. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#entries}.
          @attr name android:entries
        */
        public static final int ListView_android_entries = 0;
        /**
          <p>
          @attr description
           When set to false, the ListView will not draw the divider before each footer view.
             The default value is true. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#footerDividersEnabled}.
          @attr name android:footerDividersEnabled
        */
        public static final int ListView_android_footerDividersEnabled = 4;
        /**
          <p>
          @attr description
           When set to false, the ListView will not draw the divider after each header view.
             The default value is true. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#headerDividersEnabled}.
          @attr name android:headerDividersEnabled
        */
        public static final int ListView_android_headerDividersEnabled = 3;
        /**
          <p>
          @attr description
           Drawable to draw below list content. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#overScrollFooter}.
          @attr name android:overScrollFooter
        */
        public static final int ListView_android_overScrollFooter = 6;
        /**
          <p>
          @attr description
           Drawable to draw above list content. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#overScrollHeader}.
          @attr name android:overScrollHeader
        */
        public static final int ListView_android_overScrollHeader = 5;
        /** Attributes that can be used with a ZrcAbsListView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_cacheColorHint android:cacheColorHint}</code></td><td> Indicates that this list will always be drawn on top of solid, single-color
             opaque background.</td></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_choiceMode android:choiceMode}</code></td><td> Defines the choice behavior for the view.</td></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_drawSelectorOnTop android:drawSelectorOnTop}</code></td><td> When set to true, the selector will be drawn over the selected item.</td></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_listSelector android:listSelector}</code></td><td> Drawable used to indicate the currently selected item in the list.</td></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_scrollingCache android:scrollingCache}</code></td><td> When set to true, the list uses a drawing cache during scrolling.</td></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_smoothScrollbar android:smoothScrollbar}</code></td><td> When set to true, the list will use a more refined calculation
             method based on the pixels height of the items visible on screen.</td></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_stackFromBottom android:stackFromBottom}</code></td><td> Used by ListView and GridView to stack their content from the bottom.</td></tr>
           <tr><td><code>{@link #ZrcAbsListView_android_transcriptMode android:transcriptMode}</code></td><td> Sets the transcript mode for the list.</td></tr>
           </table>
           @see #ZrcAbsListView_android_cacheColorHint
           @see #ZrcAbsListView_android_choiceMode
           @see #ZrcAbsListView_android_drawSelectorOnTop
           @see #ZrcAbsListView_android_listSelector
           @see #ZrcAbsListView_android_scrollingCache
           @see #ZrcAbsListView_android_smoothScrollbar
           @see #ZrcAbsListView_android_stackFromBottom
           @see #ZrcAbsListView_android_transcriptMode
         */
        public static final int[] ZrcAbsListView = {
            0x010100fb, 0x010100fc, 0x010100fd, 0x010100fe,
            0x01010100, 0x01010101, 0x0101012b, 0x01010231
        };
        /**
          <p>
          @attr description
           Indicates that this list will always be drawn on top of solid, single-color
             opaque background. This allows the list to optimize drawing. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#cacheColorHint}.
          @attr name android:cacheColorHint
        */
        public static final int ZrcAbsListView_android_cacheColorHint = 5;
        /**
          <p>
          @attr description
           Defines the choice behavior for the view. By default, lists do not have
             any choice behavior. By setting the choiceMode to singleChoice, the list
             allows up to one item to be in a chosen state. By setting the choiceMode to
             multipleChoice, the list allows any number of items to be chosen.
             Finally, by setting the choiceMode to multipleChoiceModal the list allows
             any number of items to be chosen in a special selection mode.
             The application will supply a
             {@link android.widget.AbsListView.MultiChoiceModeListener} using
             {@link android.widget.AbsListView#setMultiChoiceModeListener} to control the
             selection mode. This uses the {@link android.view.ActionMode} API. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#choiceMode}.
          @attr name android:choiceMode
        */
        public static final int ZrcAbsListView_android_choiceMode = 6;
        /**
          <p>
          @attr description
           When set to true, the selector will be drawn over the selected item.
             Otherwise the selector is drawn behind the selected item. The default
             value is false. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#drawSelectorOnTop}.
          @attr name android:drawSelectorOnTop
        */
        public static final int ZrcAbsListView_android_drawSelectorOnTop = 1;
        /**
          <p>
          @attr description
           Drawable used to indicate the currently selected item in the list. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#listSelector}.
          @attr name android:listSelector
        */
        public static final int ZrcAbsListView_android_listSelector = 0;
        /**
          <p>
          @attr description
           When set to true, the list uses a drawing cache during scrolling.
             This makes the rendering faster but uses more memory. The default
             value is true. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#scrollingCache}.
          @attr name android:scrollingCache
        */
        public static final int ZrcAbsListView_android_scrollingCache = 3;
        /**
          <p>
          @attr description
           When set to true, the list will use a more refined calculation
             method based on the pixels height of the items visible on screen. This
             property is set to true by default but should be set to false if your adapter
             will display items of varying heights. When this property is set to true and
             your adapter displays items of varying heights, the scrollbar thumb will
             change size as the user scrolls through the list. When set to fale, the list
             will use only the number of items in the adapter and the number of items visible
             on screen to determine the scrollbar's properties. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#smoothScrollbar}.
          @attr name android:smoothScrollbar
        */
        public static final int ZrcAbsListView_android_smoothScrollbar = 7;
        /**
          <p>
          @attr description
           Used by ListView and GridView to stack their content from the bottom. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#stackFromBottom}.
          @attr name android:stackFromBottom
        */
        public static final int ZrcAbsListView_android_stackFromBottom = 2;
        /**
          <p>
          @attr description
           Sets the transcript mode for the list. In transcript mode, the list
             scrolls to the bottom to make new items visible when they are added. 
          <p>This corresponds to the global attribute
          resource symbol {@link android.R.attr#transcriptMode}.
          @attr name android:transcriptMode
        */
        public static final int ZrcAbsListView_android_transcriptMode = 4;
    };
}
