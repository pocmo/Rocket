package org.mozilla.focus.autobot

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withParent
import android.view.View
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.not
import org.mozilla.focus.R
import tools.fastlane.screengrab.Screengrab

open class BaseTestRobot {

    /** Open menu **/
    fun clickHomeMenu() : ViewInteraction = onView(allOf<View>(withId(R.id.btn_menu), withParent(withId(R.id.home_screen_menu)))).perform(click())
    fun clickBrowserMenu() : ViewInteraction = onView(allOf<View>(withId(R.id.btn_menu), not<View>(withParent(withId(R.id.home_screen_menu))))).perform(click())

    /** Click menu item **/
    fun clickMenuBookmarks() : ViewInteraction = onView(withId(R.id.menu_bookmark)).perform(click())
    fun clickMenuDownloads() : ViewInteraction = onView(withId(R.id.menu_download)).perform(click())
    fun clickMenuHistory() : ViewInteraction = onView(withId(R.id.menu_history)).perform(click())
    fun clickMenuMyShots() : ViewInteraction = onView(withId(R.id.menu_screenshots)).perform(click())
    fun clickMenuTurboMode() : ViewInteraction = onView(withId(R.id.menu_turbomode)).perform(click())
    fun clickMenuBlockImages() : ViewInteraction = onView(withId(R.id.menu_blockimg)).perform(click())
    fun clickMenuClearCache() : ViewInteraction = onView(withId(R.id.menu_delete)).perform(click())
    fun clickMenuSettings() : ViewInteraction = onView(withId(R.id.menu_preferences)).perform(click())

    /** Click panel item **/
    fun clickPanelDownload() : ViewInteraction = onView(withId(R.id.downloads)).perform(click())
    fun clickPanelHistory() : ViewInteraction = onView(withId(R.id.history)).perform(click())
    fun clickPanelMyShots() : ViewInteraction = onView(withId(R.id.screenshots)).perform(click())

    fun takeScreenshotViaFastlane(fileName : String) = Screengrab.screenshot(fileName)

    fun pressBack() = Espresso.pressBack()
}