Navigation 2.3.2 and Activity/Fragment lifecycle issue.
---

https://issuetracker.google.com/issues/174832563

navigation 2.3.1

```
2020-12-08 07:38:26.560 22199-22199/com.codingfeline.myapplication D/Lifecycle: MainActivity - creating
2020-12-08 07:38:26.918 22199-22199/com.codingfeline.myapplication D/Lifecycle: MainActivity - created
2020-12-08 07:38:26.960 22199-22199/com.codingfeline.myapplication D/Lifecycle: TopFragment - creating
2020-12-08 07:38:26.960 22199-22199/com.codingfeline.myapplication D/Lifecycle: TopFragment - created
```


navigation 2.3.2

```
2020-12-08 07:43:13.841 6499-6499/com.codingfeline.myapplication D/Lifecycle: MainActivity - creating
2020-12-08 07:43:14.141 6499-6499/com.codingfeline.myapplication D/Lifecycle: TopFragment - creating
2020-12-08 07:43:14.141 6499-6499/com.codingfeline.myapplication D/Lifecycle: TopFragment - created
2020-12-08 07:43:14.141 6499-6499/com.codingfeline.myapplication D/Lifecycle: MainActivity - created
```
