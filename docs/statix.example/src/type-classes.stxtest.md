---
title: type-classes.stxtest
hide:
  - toc
---

# `type-classes.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/type-classes.stxtest]

[pdmosses/nabl/statix.example/src/type-classes.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/type-classes.stxtest "The source file on GitHub"

<div class="stxtest"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
</pre></div></td>
<td class="code"><pre><code>/** <span class="token sort_OpId">Type-classes</span> <span class="token sort_ConstraintId">a</span> <span class="token sort_ConstraintId">la</span> <span class="token sort_OpId">Haskell</span>
 * <span class="token sort_OpId">Goal</span>:
 * <span class="token sort_OpId">Limitations</span>:
 * - <span class="token sort_OpId">No</span> <span class="token sort_ConstraintId">support</span> <span class="token sort_ConstraintId">for</span> <span class="token sort_ConstraintId">non</span>-<span class="token sort_ConstraintId">linear</span> <span class="token sort_ConstraintId">patterns</span>
 * <span class="token sort_OpId">Result</span>:
 */
<span class="token keyword">resolve</span> {<span class="cons_Var"><a href="#s_705_706" id="s_119_120" title="Referenced at line 32, 33, 34"><span class="token sort_ConstraintId">s</span></a></span> <span class="cons_Var"><a href="#m_127_128" id="m_121_122" title="Referenced at line 9, 33"><span class="token sort_ConstraintId">m</span></a></span>}

  <span class="cons_Var"><a href="#m_121_122" id="m_127_128" title="Defined at line 7"><span class="token sort_ConstraintId">m</span></a></span> == <a href="#Module_826_832" id="Module_132_138" title="Defined at line 41"><span class="token sort_OpId">Module</span></a>([

<span class="token layout">//  class () =&gt; Eq a where</span>
<span class="token layout">//    eq :: a -&gt; a -&gt; Bool   -- eq :: Eq a =&gt; a -&gt; a -&gt; Bool</span>
    <a href="#ClassDef_885_893" id="ClassDef_234_242" title="Defined at line 44"><span class="token sort_OpId">ClassDef</span></a>([], <span class="cons_Str">"Eq"</span>, <a href="#TVar_1066_1070" id="TVar_253_257" title="Defined at line 50"><span class="token sort_OpId">TVar</span></a>(<span class="cons_Str">"a"</span>), [
      <a href="#Fun_1117_1120" id="Fun_272_275" title="Defined at line 53"><span class="token sort_OpId">Fun</span></a>(<span class="cons_Str">"eq"</span>, [<a href="#TVar_1066_1070" id="TVar_283_287" title="Defined at line 50"><span class="token sort_OpId">TVar</span></a>(<span class="cons_Str">"a"</span>), <a href="#TVar_1066_1070" id="TVar_294_298" title="Defined at line 50"><span class="token sort_OpId">TVar</span></a>(<span class="cons_Str">"a"</span>)], <a href="#Bool_1034_1038" id="Bool_306_310" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>(), [])
    ])

<span class="token layout">//  instance () =&gt; Eq Bool where</span>
<span class="token layout">//    eq True True = True </span>
<span class="token layout">//    eq False False = True </span>
  , <a href="#InstanceDef_946_957" id="InstanceDef_419_430" title="Defined at line 45"><span class="token sort_OpId">InstanceDef</span></a>([], <span class="cons_Str">"Eq"</span>, <a href="#Bool_1034_1038" id="Bool_441_445" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>(), [
      <a href="#Fun_1117_1120" id="Fun_457_460" title="Defined at line 53"><span class="token sort_OpId">Fun</span></a>(<span class="cons_Str">"eq"</span>, [<a href="#Bool_1034_1038" id="Bool_468_472" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>(), <a href="#Bool_1034_1038" id="Bool_476_480" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>()], <a href="#Bool_1034_1038" id="Bool_485_489" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>(), [
        <a href="#Case_1206_1210" id="Case_503_507" title="Defined at line 56"><span class="token sort_OpId">Case</span></a>([<a href="#True_1354_1358" id="True_509_513" title="Defined at line 63"><span class="token sort_OpId">True</span></a>() , <a href="#True_1354_1358" id="True_518_522" title="Defined at line 63"><span class="token sort_OpId">True</span></a>() ], <a href="#Term_1304_1308" id="Term_528_532" title="Defined at line 60"><span class="token sort_OpId">Term</span></a>(<a href="#True_1354_1358" id="True_533_537" title="Defined at line 63"><span class="token sort_OpId">True</span></a>()))
      , <a href="#Case_1206_1210" id="Case_550_554" title="Defined at line 56"><span class="token sort_OpId">Case</span></a>([<a href="#False_1371_1376" id="False_556_561" title="Defined at line 64"><span class="token sort_OpId">False</span></a>(), <a href="#False_1371_1376" id="False_565_570" title="Defined at line 64"><span class="token sort_OpId">False</span></a>()], <a href="#Term_1304_1308" id="Term_575_579" title="Defined at line 60"><span class="token sort_OpId">Term</span></a>(<a href="#True_1354_1358" id="True_580_584" title="Defined at line 63"><span class="token sort_OpId">True</span></a>()))
      ])
    ])

<span class="token layout">// instance Eq a =&gt; Eq (a * a) where</span>
<span class="token layout">//  (x1, x2) == (y1, y2) = x1 == y1 &amp;&amp; x2 == y2</span>

  ]),

  <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_119_120" id="s_705_706" title="Defined at line 7"><span class="token sort_ConstraintId">s</span></a></span>,
  <a href="#moduleOk_1876_1884" id="moduleOk_710_718" title="Defined at line 93"><span class="token keyword">module</span><span class="token sort_OpId">Ok</span></a>(<span class="cons_Var"><a href="#s_119_120" id="s_719_720" title="Defined at line 7"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#m_121_122" id="m_722_723" title="Defined at line 7"><span class="token sort_ConstraintId">m</span></a></span>),
  <a href="#instanceOf_2441_2451" id="instanceOf_728_738" title="Defined at line 125"><span class="token keyword">in</span><span class="token sort_ConstraintId">stanceOf</span></a>(<span class="cons_Var"><a href="#s_119_120" id="s_739_740" title="Defined at line 7"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Str">"Eq"</span>, <a href="#Bool_1034_1038" id="Bool_748_752" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>()) == _

<span class="token keyword">signature</span>

  <span class="token sort_ConstraintId">sorts</span> <a href="#ID_910_912" id="ID_781_783" title="Referenced at line 44, 45, 50, 53, 59, 65, 74, 77, 78, 79"><span class="token sort_OpId">ID</span></a> = <span class="token sort_ConstraintId">string</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Module_848_854" id="Module_802_808" title="Referenced at line 41, 93"><span class="token sort_OpId">Module</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#Module_132_138" id="Module_826_832" title="Referenced at line 9, 95"><span class="token sort_OpId">Module</span></a> : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Def_864_867" id="Def_840_843" title="Defined at line 43"><span class="token sort_OpId">Def</span></a></span>) -&gt; <span class="cons_SimpleSort"><a href="#Module_802_808" id="Module_848_854" title="Defined at line 40"><span class="token sort_OpId">Module</span></a></span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Def_840_843" id="Def_864_867" title="Referenced at line 41, 44, 45, 102"><span class="token sort_OpId">Def</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#ClassDef_234_242" id="ClassDef_885_893" title="Referenced at line 13, 104"><span class="token sort_OpId">ClassDef</span></a>    : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#TC_1536_1538" id="TC_904_906" title="Defined at line 73"><span class="token sort_OpId">TC</span></a></span>) * <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_910_912" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_915_919" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> * <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#FunDef_1093_1099" id="FunDef_927_933" title="Defined at line 52"><span class="token sort_OpId">FunDef</span></a></span>) -&gt; <span class="cons_SimpleSort"><a href="#Def_864_867" id="Def_938_941" title="Defined at line 43"><span class="token sort_OpId">Def</span></a></span>
    <a href="#InstanceDef_419_430" id="InstanceDef_946_957" title="Referenced at line 20, 109"><span class="token sort_OpId">InstanceDef</span></a> : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#TC_1536_1538" id="TC_965_967" title="Defined at line 73"><span class="token sort_OpId">TC</span></a></span>) * <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_971_973" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_976_980" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> * <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#FunDef_1093_1099" id="FunDef_988_994" title="Defined at line 52"><span class="token sort_OpId">FunDef</span></a></span>) -&gt; <span class="cons_SimpleSort"><a href="#Def_864_867" id="Def_999_1002" title="Defined at line 43"><span class="token sort_OpId">Def</span></a></span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Type_915_919" id="Type_1012_1016" title="Referenced at line 44, 45, 48, 49, 50, 53, 53, 70, 71, 71, 74, 89, 116, 119, 125, 136, 136, 140, 140"><span class="token sort_OpId">Type</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#Bool_306_310" id="Bool_1034_1038" title="Referenced at line 14, 20, 21, 21, 21, 34, 145, 145"><span class="token sort_OpId">Bool</span></a> : <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1041_1045" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>
    <span id="Int_1050_1053" title="Not referenced locally, nor via imports"><span class="token sort_OpId">Int</span></span>  : <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1057_1061" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>
    <a href="#TVar_253_257" id="TVar_1066_1070" title="Referenced at line 13, 14, 14, 117, 120, 142"><span class="token sort_OpId">TVar</span></a> : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1073_1075" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1079_1083" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#FunDef_927_933" id="FunDef_1093_1099" title="Referenced at line 44, 45, 53"><span class="token sort_OpId">FunDef</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#Fun_272_275" id="Fun_1117_1120" title="Referenced at line 14, 21"><span class="token sort_OpId">Fun</span></a> : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1123_1125" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span> * <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1133_1137" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>) * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1141_1145" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> * <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#FunCase_1181_1188" id="FunCase_1153_1160" title="Defined at line 55"><span class="token sort_OpId">FunCase</span></a></span>) -&gt; <span class="cons_SimpleSort"><a href="#FunDef_1093_1099" id="FunDef_1165_1171" title="Defined at line 52"><span class="token sort_OpId">FunDef</span></a></span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#FunCase_1153_1160" id="FunCase_1181_1188" title="Referenced at line 53, 56"><span class="token sort_OpId">FunCase</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#Case_503_507" id="Case_1206_1210" title="Referenced at line 22, 23"><span class="token sort_OpId">Case</span></a> : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Term_1332_1336" id="Term_1218_1222" title="Defined at line 62"><span class="token sort_OpId">Term</span></a></span>) * <span class="cons_SimpleSort"><a href="#Exp_1250_1253" id="Exp_1226_1229" title="Defined at line 58"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#FunCase_1181_1188" id="FunCase_1233_1240" title="Defined at line 55"><span class="token sort_OpId">FunCase</span></a></span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Exp_1226_1229" id="Exp_1250_1253" title="Referenced at line 56, 59, 59, 60"><span class="token sort_OpId">Exp</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <span id="App_1271_1274" title="Not referenced locally, nor via imports"><span class="token sort_OpId">App</span></span>  : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1278_1280" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span> * <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Exp_1250_1253" id="Exp_1288_1291" title="Defined at line 58"><span class="token sort_OpId">Exp</span></a></span>) -&gt; <span class="cons_SimpleSort"><a href="#Exp_1250_1253" id="Exp_1296_1299" title="Defined at line 58"><span class="token sort_OpId">Exp</span></a></span>
    <a href="#Term_528_532" id="Term_1304_1308" title="Referenced at line 22, 23"><span class="token sort_OpId">Term</span></a> : <span class="cons_SimpleSort"><a href="#Term_1332_1336" id="Term_1311_1315" title="Defined at line 62"><span class="token sort_OpId">Term</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_1250_1253" id="Exp_1319_1322" title="Defined at line 58"><span class="token sort_OpId">Exp</span></a></span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Term_1218_1222" id="Term_1332_1336" title="Referenced at line 56, 60, 63, 64, 65"><span class="token sort_OpId">Term</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#True_509_513" id="True_1354_1358" title="Referenced at line 22, 22, 22, 23"><span class="token sort_OpId">True</span></a>  : <span class="cons_SimpleSort"><a href="#Term_1332_1336" id="Term_1362_1366" title="Defined at line 62"><span class="token sort_OpId">Term</span></a></span>
    <a href="#False_556_561" id="False_1371_1376" title="Referenced at line 23, 23"><span class="token sort_OpId">False</span></a> : <span class="cons_SimpleSort"><a href="#Term_1332_1336" id="Term_1379_1383" title="Defined at line 62"><span class="token sort_OpId">Term</span></a></span>
    <span id="Var_1388_1391" title="Not referenced locally, nor via imports"><span class="token sort_OpId">Var</span></span>   : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1396_1398" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Term_1332_1336" id="Term_1402_1406" title="Defined at line 62"><span class="token sort_OpId">Term</span></a></span>

<span class="token keyword">signature</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#TYPE_1473_1477" id="TYPE_1427_1431" title="Referenced at line 70, 71, 88"><span class="token sort_OpId">TYPE</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#CLASS_2138_2143" id="CLASS_1449_1454" title="Referenced at line 107, 112, 130, 132"><span class="token sort_OpId">CLASS</span></a> : <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1457_1461" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> * <span class="token sort_ConstraintId">scope</span> -&gt; <span class="cons_SimpleSort"><a href="#TYPE_1427_1431" id="TYPE_1473_1477" title="Defined at line 69"><span class="token sort_OpId">TYPE</span></a></span>
    <span id="FUN_1482_1485" title="Not referenced locally, nor via imports"><span class="token sort_OpId">FUN</span></span>   : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#TC_1536_1538" id="TC_1495_1497" title="Defined at line 73"><span class="token sort_OpId">TC</span></a></span>) * <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1506_1510" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>) * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1514_1518" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#TYPE_1427_1431" id="TYPE_1522_1526" title="Defined at line 69"><span class="token sort_OpId">TYPE</span></a></span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#TC_904_906" id="TC_1536_1538" title="Referenced at line 44, 45, 71, 74"><span class="token sort_OpId">TC</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <span id="TC_1556_1558" title="Not referenced locally, nor via imports"><span class="token sort_OpId">TC</span></span> : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1561_1563" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1566_1570" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#TC_1536_1538" id="TC_1574_1576" title="Defined at line 73"><span class="token sort_OpId">TC</span></a></span>

  <span class="token keyword">namespaces</span>
    <a href="#Class_1689_1694" id="Class_1595_1600" title="Referenced at line 83, 107, 107"><span class="token sort_OpId">Class</span></a>    : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1606_1608" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span>
    <a href="#Instance_1727_1735" id="Instance_1613_1621" title="Referenced at line 84, 112, 112, 130"><span class="token sort_OpId">Instance</span></a> : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1624_1626" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span>
    <a href="#Fun_1768_1771" id="Fun_1631_1634" title="Referenced at line 85"><span class="token sort_OpId">Fun</span></a>      : <span class="cons_SimpleSort"><a href="#ID_781_783" id="ID_1642_1644" title="Defined at line 38"><span class="token sort_OpId">ID</span></a></span>

  <span class="token keyword">name-resolution</span>
    <span class="token keyword">labels</span> <a href="#P_1702_1703" id="P_1675_1676" title="Referenced at line 83, 83, 84, 84, 85, 85, 129, 131"><span class="token sort_OpId">P</span></a>
    <span class="token keyword">resolve</span> <a href="#Class_1595_1600" id="Class_1689_1694" title="Defined at line 77"><span class="token sort_OpId">Class</span></a> <span class="token keyword">filter</span> <a href="#P_1675_1676" id="P_1702_1703" title="Defined at line 82"><span class="token sort_OpId">P</span></a>* <span class="token keyword">min</span> $ &lt; <a href="#P_1675_1676" id="P_1713_1714" title="Defined at line 82"><span class="token sort_OpId">P</span></a>
    <span class="token keyword">resolve</span> <a href="#Instance_1613_1621" id="Instance_1727_1735" title="Defined at line 78"><span class="token sort_OpId">Instance</span></a> <span class="token keyword">filter</span> <a href="#P_1675_1676" id="P_1743_1744" title="Defined at line 82"><span class="token sort_OpId">P</span></a>* <span class="token keyword">min</span> $ &lt; <a href="#P_1675_1676" id="P_1754_1755" title="Defined at line 82"><span class="token sort_OpId">P</span></a>
    <span class="token keyword">resolve</span> <a href="#Fun_1631_1634" id="Fun_1768_1771" title="Defined at line 79"><span class="token sort_OpId">Fun</span></a> <span class="token keyword">filter</span> <a href="#P_1675_1676" id="P_1779_1780" title="Defined at line 82"><span class="token sort_OpId">P</span></a>* <span class="token keyword">min</span> $ &lt; <a href="#P_1675_1676" id="P_1790_1791" title="Defined at line 82"><span class="token sort_OpId">P</span></a>
    
  <span class="token keyword">relations</span>
    <a href="#type_2133_2137" id="type_1813_1817" title="Referenced at line 107, 112, 128"><span class="token sort_ConstraintId">type</span></a>  : <span class="token sort_ConstraintId">occurrence</span> * <span class="cons_SimpleSort"><a href="#TYPE_1427_1431" id="TYPE_1834_1838" title="Defined at line 69"><span class="token sort_OpId">TYPE</span></a></span>
    <a href="#subst_2892_2897" id="subst_1843_1848" title="Referenced at line 143"><span class="token sort_ConstraintId">subst</span></a> : <span class="token sort_ConstraintId">string</span> -&gt; <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_1861_1865" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>

<span class="token keyword">rules</span>

  <a href="#moduleOk_710_718" id="moduleOk_1876_1884" title="Referenced at line 33, 95"><span class="token keyword">module</span><span class="token sort_OpId">Ok</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Module_802_808" id="Module_1895_1901" title="Defined at line 40"><span class="token sort_OpId">Module</span></a></span>

  <a href="#moduleOk_1876_1884" id="moduleOk_1905_1913" title="Defined at line 93"><span class="token keyword">module</span><span class="token sort_OpId">Ok</span></a>(<span class="cons_Var"><a href="#s_1945_1946" id="s_1914_1915" title="Referenced at line 96"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Module_826_832" id="Module_1917_1923" title="Defined at line 41"><span class="token sort_OpId">Module</span></a>(<span class="cons_Var"><a href="#defs_1948_1952" id="defs_1924_1928" title="Referenced at line 96"><span class="token sort_ConstraintId">defs</span></a></span>)) :-
    <a href="#defsOk_1965_1971" id="defsOk_1938_1944" title="Defined at line 100"><span class="token sort_ConstraintId">defsOk</span></a>(<span class="cons_Var"><a href="#s_1914_1915" id="s_1945_1946" title="Defined at line 95"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#defs_1924_1928" id="defs_1948_1952" title="Defined at line 95"><span class="token sort_ConstraintId">defs</span></a></span>).

<span class="token keyword">rules</span>

  <a href="#defsOk_1938_1944" id="defsOk_1965_1971" title="Referenced at line 96"><span class="token sort_ConstraintId">defsOk</span></a> <span class="token keyword">maps</span> <a href="#defOk_1998_2003" id="defOk_1977_1982" title="Defined at line 102"><span class="token sort_ConstraintId">defOk</span></a>(*, <span class="token sort_ConstraintId">list</span>(*))

  <a href="#defOk_1977_1982" id="defOk_1998_2003" title="Referenced at line 100, 104, 109"><span class="token sort_ConstraintId">defOk</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Def_864_867" id="Def_2014_2017" title="Defined at line 43"><span class="token sort_OpId">Def</span></a></span>    

  <a href="#defOk_1998_2003" id="defOk_2025_2030" title="Defined at line 102"><span class="token sort_ConstraintId">defOk</span></a>(<span class="cons_Var"><a href="#s_2112_2113" id="s_2031_2032" title="Referenced at line 107, 107"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#ClassDef_885_893" id="ClassDef_2034_2042" title="Defined at line 44"><span class="token sort_OpId">ClassDef</span></a>([], <span class="cons_Var"><a href="#x_2123_2124" id="x_2047_2048" title="Referenced at line 107, 107, 107, 107"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#ty_2086_2088" id="ty_2050_2052" title="Referenced at line 105, 107"><span class="token sort_ConstraintId">ty</span></a></span>, <span class="cons_Var"><span id="funs_2054_2058" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">funs</span></span></span>)) :- {<span class="cons_Var"><a href="#s_class_2099_2106" id="s_class_2065_2072" title="Referenced at line 106, 107"><span class="token sort_ConstraintId">s_class</span></a></span>}
    <a href="#varType_2314_2321" id="varType_2078_2085" title="Defined at line 116"><span class="token sort_ConstraintId">varType</span></a>(<span class="cons_Var"><a href="#ty_2050_2052" id="ty_2086_2088" title="Defined at line 104"><span class="token sort_ConstraintId">ty</span></a></span>),
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_class_2065_2072" id="s_class_2099_2106" title="Defined at line 104"><span class="token sort_ConstraintId">s_class</span></a></span>,
    <span class="token sort_ConstraintId">s</span> -&gt; <span class="token sort_OpId">Class</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#type_1813_1817" id="type_2133_2137" title="Defined at line 88"><span class="token sort_ConstraintId">type</span></a> <a href="#CLASS_1449_1454" id="CLASS_2138_2143" title="Defined at line 70"><span class="token sort_OpId">CLASS</span></a>(<span class="cons_Var"><a href="#ty_2050_2052" id="ty_2144_2146" title="Defined at line 104"><span class="token sort_ConstraintId">ty</span></a></span>, <span class="cons_Var"><a href="#s_class_2065_2072" id="s_class_2148_2155" title="Defined at line 104"><span class="token sort_ConstraintId">s_class</span></a></span>).

  <a href="#defOk_1998_2003" id="defOk_2161_2166" title="Defined at line 102"><span class="token sort_ConstraintId">defOk</span></a>(<span class="cons_Var"><a href="#s_2256_2257" id="s_2167_2168" title="Referenced at line 112, 112"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#InstanceDef_946_957" id="InstanceDef_2170_2181" title="Defined at line 45"><span class="token sort_OpId">InstanceDef</span></a>([], <span class="cons_Var"><a href="#x_2270_2271" id="x_2186_2187" title="Referenced at line 112, 112, 112, 112"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#ty_2231_2233" id="ty_2189_2191" title="Referenced at line 110, 112"><span class="token sort_ConstraintId">ty</span></a></span>, <span class="cons_Var"><span id="funs_2193_2197" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">funs</span></span></span>)) :- {<span class="cons_Var"><a href="#s_inst_2244_2250" id="s_inst_2204_2210" title="Referenced at line 111, 112"><span class="token sort_ConstraintId">s_inst</span></a></span>}
    <a href="#headNormalType_2352_2366" id="headNormalType_2216_2230" title="Defined at line 119"><span class="token sort_ConstraintId">headNormalType</span></a>(<span class="cons_Var"><a href="#ty_2189_2191" id="ty_2231_2233" title="Defined at line 109"><span class="token sort_ConstraintId">ty</span></a></span>),
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_inst_2204_2210" id="s_inst_2244_2250" title="Defined at line 109"><span class="token sort_ConstraintId">s_inst</span></a></span>,
    <span class="token sort_ConstraintId">s</span> -&gt; <span class="token sort_OpId">Instance</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#type_1813_1817" id="type_2280_2284" title="Defined at line 88"><span class="token sort_ConstraintId">type</span></a> <a href="#CLASS_1449_1454" id="CLASS_2285_2290" title="Defined at line 70"><span class="token sort_OpId">CLASS</span></a>(<span class="cons_Var"><a href="#ty_2189_2191" id="ty_2291_2293" title="Defined at line 109"><span class="token sort_ConstraintId">ty</span></a></span>, <span class="cons_Var"><a href="#s_inst_2204_2210" id="s_inst_2295_2301" title="Defined at line 109"><span class="token sort_ConstraintId">s_inst</span></a></span>).

<span class="token keyword">rules</span>

  <a href="#varType_2078_2085" id="varType_2314_2321" title="Referenced at line 105, 117"><span class="token sort_ConstraintId">varType</span></a> : <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_2324_2328" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>
  <a href="#varType_2314_2321" id="varType_2331_2338" title="Defined at line 116"><span class="token sort_ConstraintId">varType</span></a>(<a href="#TVar_1066_1070" id="TVar_2339_2343" title="Defined at line 50"><span class="token sort_OpId">TVar</span></a>(_)).

  <a href="#headNormalType_2216_2230" id="headNormalType_2352_2366" title="Referenced at line 110, 120, 121"><span class="token sort_ConstraintId">headNormalType</span></a> : <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_2369_2373" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>
  <a href="#headNormalType_2352_2366" id="headNormalType_2376_2390" title="Defined at line 119"><span class="token sort_ConstraintId">headNormalType</span></a>(<a href="#TVar_1066_1070" id="TVar_2391_2395" title="Defined at line 50"><span class="token sort_OpId">TVar</span></a>(_)) :- <span class="token keyword">false</span>.
  <a href="#headNormalType_2352_2366" id="headNormalType_2412_2426" title="Defined at line 119"><span class="token sort_ConstraintId">headNormalType</span></a>(_).

<span class="token keyword">rules</span>

  <a href="#instanceOf_728_738" id="instanceOf_2441_2451" title="Referenced at line 34, 127"><span class="token keyword">in</span><span class="token sort_ConstraintId">stanceOf</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="token sort_ConstraintId">string</span> * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_2471_2475" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> -&gt; (<span class="token sort_ConstraintId">occurrence</span> * <span class="token sort_ConstraintId">scope</span>)

  <a href="#instanceOf_2441_2451" id="instanceOf_2503_2513" title="Defined at line 125"><span class="token keyword">in</span><span class="token sort_ConstraintId">stanceOf</span></a>(<span class="cons_Var"><a href="#s_2709_2710" id="s_2514_2515" title="Referenced at line 132"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#x_2641_2642" id="x_2517_2518" title="Referenced at line 130"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#ty_2660_2662" id="ty_2520_2522" title="Referenced at line 130"><span class="token sort_ConstraintId">ty</span></a></span>) = (<span class="cons_Var"><a href="#d_2721_2722" id="d_2527_2528" title="Referenced at line 132"><span class="token sort_ConstraintId">d</span></a></span>, <span class="cons_Var"><a href="#s_inst_2739_2745" id="s_inst_2530_2536" title="Referenced at line 132"><span class="token sort_ConstraintId">s_inst</span></a></span>) :- {<span class="cons_Var"><a href="#ty_inst_2730_2737" id="ty_inst_2542_2549" title="Referenced at line 132"><span class="token sort_ConstraintId">ty_inst</span></a></span>}
    <span class="token keyword">query</span> <a href="#type_1813_1817" id="type_2561_2565" title="Defined at line 88"><span class="token sort_ConstraintId">type</span></a>
      <span class="token keyword">filter</span> <a href="#P_1675_1676" id="P_2579_2580" title="Defined at line 82"><span class="token sort_OpId">P</span></a>*
          <span class="token keyword">and</span> { (<a href="#Instance_1613_1621" id="Instance_2599_2607" title="Defined at line 78"><span class="token sort_OpId">Instance</span></a>{<span class="cons_Var"><a href="#x_inst_2646_2652" id="x_inst_2608_2614" title="Referenced at line 130"><span class="token sort_ConstraintId">x_inst</span></a></span>@_}, <a href="#CLASS_1449_1454" id="CLASS_2619_2624" title="Defined at line 70"><span class="token sort_OpId">CLASS</span></a>(<span class="cons_Var"><a href="#ty_inst_2664_2671" id="ty_inst_2625_2632" title="Referenced at line 130"><span class="token sort_ConstraintId">ty_inst</span></a></span>, _)) :- <span class="cons_Var"><a href="#x_2517_2518" id="x_2641_2642" title="Defined at line 127"><span class="token sort_ConstraintId">x</span></a></span> == <span class="cons_Var"><a href="#x_inst_2608_2614" id="x_inst_2646_2652" title="Defined at line 130"><span class="token sort_ConstraintId">x_inst</span></a></span>, <a href="#match_2761_2766" id="match_2654_2659" title="Defined at line 136"><span class="token sort_ConstraintId">match</span></a>(<span class="cons_Var"><a href="#ty_2520_2522" id="ty_2660_2662" title="Defined at line 127"><span class="token sort_ConstraintId">ty</span></a></span>, <span class="cons_Var"><a href="#ty_inst_2625_2632" id="ty_inst_2664_2671" title="Defined at line 130"><span class="token sort_ConstraintId">ty_inst</span></a></span>) }
      <span class="token keyword">min</span> $ &lt; <a href="#P_1675_1676" id="P_2689_2690" title="Defined at line 82"><span class="token sort_OpId">P</span></a> <span class="token keyword">and</span> <span class="token keyword">true</span>
      <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_2514_2515" id="s_2709_2710" title="Defined at line 127"><span class="token sort_ConstraintId">s</span></a></span> |-&gt; [(_, (<span class="cons_Var"><a href="#d_2527_2528" id="d_2721_2722" title="Defined at line 127"><span class="token sort_ConstraintId">d</span></a></span>, <a href="#CLASS_1449_1454" id="CLASS_2724_2729" title="Defined at line 70"><span class="token sort_OpId">CLASS</span></a>(<span class="cons_Var"><a href="#ty_inst_2542_2549" id="ty_inst_2730_2737" title="Defined at line 127"><span class="token sort_ConstraintId">ty_inst</span></a></span>, <span class="cons_Var"><a href="#s_inst_2530_2536" id="s_inst_2739_2745" title="Defined at line 127"><span class="token sort_ConstraintId">s_inst</span></a></span>)))].

<span class="token keyword">rules</span>

  <a href="#match_2654_2659" id="match_2761_2766" title="Referenced at line 130, 138"><span class="token sort_ConstraintId">match</span></a> : <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_2769_2773" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_2776_2780" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>

  <a href="#match_2761_2766" id="match_2784_2789" title="Defined at line 136"><span class="token sort_ConstraintId">match</span></a>(<span class="cons_Var"><a href="#P_2812_2813" id="P_2790_2791" title="Referenced at line 138"><span class="token sort_OpId">P</span></a></span>, <span class="cons_Var"><a href="#T_2815_2816" id="T_2793_2794" title="Referenced at line 138"><span class="token sort_OpId">T</span></a></span>) :- <a href="#matchIn_2826_2833" id="matchIn_2799_2806" title="Defined at line 140"><span class="token sort_ConstraintId">matchIn</span></a>(<span class="token keyword">new</span>, <span class="cons_Var"><a href="#P_2790_2791" id="P_2812_2813" title="Defined at line 138"><span class="token sort_OpId">P</span></a></span>, <span class="cons_Var"><a href="#T_2793_2794" id="T_2815_2816" title="Defined at line 138"><span class="token sort_OpId">T</span></a></span>).
    
  <a href="#matchIn_2799_2806" id="matchIn_2826_2833" title="Referenced at line 138, 142, 145"><span class="token sort_ConstraintId">matchIn</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_2844_2848" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_1012_1016" id="Type_2851_2855" title="Defined at line 47"><span class="token sort_OpId">Type</span></a></span>
  
  <a href="#matchIn_2826_2833" id="matchIn_2861_2868" title="Defined at line 140"><span class="token sort_ConstraintId">matchIn</span></a>(<span class="cons_Var"><a href="#s_2907_2908" id="s_2869_2870" title="Referenced at line 143"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#TVar_1066_1070" id="TVar_2872_2876" title="Defined at line 50"><span class="token sort_OpId">TVar</span></a>(<span class="cons_Var"><a href="#x_2898_2899" id="x_2877_2878" title="Referenced at line 143"><span class="token sort_ConstraintId">x</span></a></span>), <span class="cons_Var"><a href="#T_2901_2902" id="T_2881_2882" title="Referenced at line 143"><span class="token sort_OpId">T</span></a></span>) :-
    !<a href="#subst_1843_1848" id="subst_2892_2897" title="Defined at line 89"><span class="token sort_ConstraintId">subst</span></a>[<span class="cons_Var"><a href="#x_2877_2878" id="x_2898_2899" title="Defined at line 142"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#T_2881_2882" id="T_2901_2902" title="Defined at line 142"><span class="token sort_OpId">T</span></a></span>] <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_2869_2870" id="s_2907_2908" title="Defined at line 142"><span class="token sort_ConstraintId">s</span></a></span>.

  <a href="#matchIn_2826_2833" id="matchIn_2913_2920" title="Defined at line 140"><span class="token sort_ConstraintId">matchIn</span></a>(<span class="cons_Var"><span id="s_2921_2922" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <a href="#Bool_1034_1038" id="Bool_2924_2928" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>(), <a href="#Bool_1034_1038" id="Bool_2932_2936" title="Defined at line 48"><span class="token sort_OpId">Bool</span></a>()).

</code></pre></td></tr></tbody></table></div>