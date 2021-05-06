# Basic Tabs
A barebones Android application that utilizes tabbed layout via fragments, and a basic splash screen as well if so desired.

## Usage
To add a new tab, simply create a new fragment under the Pages package. Add the newly-created fragment to Home.java using the following:
```
viewPagerAdapter.add(new Tab4(), "Tab4");
```
You can also add icons to the individual tabs. Once you have your icons stored in your drawable folder, initialize your icons on Home.java:

```
int[] icons = {
            R.drawable.your_icon_1,
            R.drawable.your_icon_2,
            R.drawable.your_icon_3,
    };
```
and add this at the end of the onCreate method:
```
for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(icons[i]);
        }
```
