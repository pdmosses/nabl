---
title: stlc.stxtest
hide:
  - toc
---

# `stlc.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/stlc.stxtest]

[pdmosses/nabl/statix.example/src/stlc.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/stlc.stxtest "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="token keyword">resolve</span> {<span class="cons_Var"><a href="#s_23_24" id="s_9_10" title="Referenced at line 3, 3"><span class="token sort_ConstraintId">s</span></a></span> <span class="cons_Var"><a href="#T_45_46" id="T_11_12" title="Referenced at line 3"><span class="token sort_OpId">T</span></a></span> <span class="cons_Var"><a href="#e_39_40" id="e_13_14" title="Referenced at line 3"><span class="token sort_ConstraintId">e</span></a></span>}

  <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_9_10" id="s_23_24" title="Defined at line 1"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#typeOfExp_847_856" id="typeOfExp_26_35" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_9_10" id="s_36_37" title="Defined at line 1"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e_13_14" id="e_39_40" title="Defined at line 1"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_11_12" id="T_45_46" title="Defined at line 1"><span class="token sort_OpId">T</span></a></span>

<span class="token keyword">signature</span>
  <span class="token sort_ConstraintId">sorts</span> <a href="#ID_235_237" id="ID_66_68" title="Referenced at line 10, 11, 16"><span class="token sort_OpId">ID</span></a> = <span class="token sort_ConstraintId">string</span>                         <span class="token layout">// $x$</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Exp_178_181" id="Exp_118_121" title="Referenced at line 9, 10, 10, 11, 12, 12, 12, 13, 13, 16, 34"><span class="token sort_OpId">Exp</span></a></span> <span class="token sort_ConstraintId">constructors</span>                    <span class="token layout">// $e$ :=</span>
    <a href="#Unit_895_899" id="Unit_168_172" title="Referenced at line 36"><span class="token sort_OpId">Unit</span></a>    : <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_178_181" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span>                           <span class="token layout">//      | ()</span>
    <a href="#Fun_929_932" id="Fun_225_228" title="Referenced at line 38"><span class="token sort_OpId">Fun</span></a>     : <span class="cons_SimpleSort"><a href="#ID_66_68" id="ID_235_237" title="Defined at line 6"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_240_244" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_247_250" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_254_257" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span>        <span class="token layout">//      | fun ($x$ : $T$) { $e$ }</span>
    <a href="#Var_1082_1085" id="Var_303_306" title="Referenced at line 43"><span class="token sort_OpId">Var</span></a>     : <span class="cons_SimpleSort"><a href="#ID_66_68" id="ID_313_315" title="Defined at line 6"><span class="token sort_OpId">ID</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_319_322" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span>                     <span class="token layout">//      | $x$</span>
    <a href="#App_1170_1173" id="App_361_364" title="Referenced at line 46"><span class="token sort_OpId">App</span></a>     : <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_371_374" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_377_380" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_384_387" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span>              <span class="token layout">//      | $e$ $e$</span>
    <a href="#Let_1286_1289" id="Let_423_426" title="Referenced at line 51"><span class="token sort_OpId">Let</span></a>     : <span class="token sort_ConstraintId">list</span>(<span class="cons_SimpleSort"><a href="#Bind_498_502" id="Bind_438_442" title="Defined at line 15"><span class="token sort_OpId">Bind</span></a></span>) * <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_446_449" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_453_456" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span>       <span class="token layout">//      | let $b*$ in $e$</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Bind_438_442" id="Bind_498_502" title="Referenced at line 13, 16, 57"><span class="token sort_OpId">Bind</span></a></span> <span class="token sort_ConstraintId">constructors</span>                   <span class="token layout">// $b$ :=</span>
    <a href="#Bind_1480_1484" id="Bind_548_552" title="Referenced at line 59"><span class="token sort_OpId">Bind</span></a> : <span class="cons_SimpleSort"><a href="#ID_66_68" id="ID_555_557" title="Defined at line 6"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_560_564" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_567_570" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Bind_498_502" id="Bind_574_578" title="Defined at line 15"><span class="token sort_OpId">Bind</span></a></span>          <span class="token layout">//      | $x$ : $T$ = $e$</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Type_240_244" id="Type_623_627" title="Referenced at line 10, 16, 19, 20, 20, 20, 23, 34"><span class="token sort_OpId">Type</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#UNIT_905_909" id="UNIT_645_649" title="Referenced at line 36"><span class="token sort_OpId">UNIT</span></a> : <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_652_656" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>
    <a href="#FUN_945_948" id="FUN_661_664" title="Referenced at line 38, 47"><span class="token sort_OpId">FUN</span></a>  : <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_668_672" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_675_679" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_683_687" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>

  <span class="token keyword">relations</span>
    <a href="#typeOfDecl_1022_1032" id="typeOfDecl_705_715" title="Referenced at line 40, 44, 60"><span class="token sort_ConstraintId">typeOfDecl</span></a> : <span class="token sort_ConstraintId">occurrence</span> -&gt; <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_732_736" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>

  <span class="token keyword">namespaces</span>
    <a href="#Var_813_816" id="Var_755_758" title="Referenced at line 30, 40, 40, 44, 44, 44, 60, 60"><span class="token sort_OpId">Var</span></a>  : <span class="token sort_ConstraintId">string</span>

  <span class="token keyword">name-resolution</span>
    <span class="token keyword">labels</span> <a href="#P_824_825" id="P_799_800" title="Referenced at line 30, 30, 39, 52"><span class="token sort_OpId">P</span></a>
    <span class="token keyword">resolve</span> <a href="#Var_755_758" id="Var_813_816" title="Defined at line 26"><span class="token sort_OpId">Var</span></a> <span class="token keyword">filter</span> <a href="#P_799_800" id="P_824_825" title="Defined at line 29"><span class="token sort_OpId">P</span></a>* <span class="token keyword">min</span> $ &lt; <a href="#P_799_800" id="P_835_836" title="Defined at line 29"><span class="token sort_OpId">P</span></a>

<span class="token keyword">rules</span>

  <a href="#typeOfExp_26_35" id="typeOfExp_847_856" title="Referenced at line 3, 36, 38, 41, 43, 46, 47, 48, 51, 54, 61"><span class="token sort_ConstraintId">typeOfExp</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Exp_118_121" id="Exp_867_870" title="Defined at line 8"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_623_627" id="Type_874_878" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>

  <a href="#typeOfExp_847_856" id="typeOfExp_882_891" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(_, <a href="#Unit_168_172" id="Unit_895_899" title="Defined at line 9"><span class="token sort_OpId">Unit</span></a>()) = <a href="#UNIT_645_649" id="UNIT_905_909" title="Defined at line 19"><span class="token sort_OpId">UNIT</span></a>().

  <a href="#typeOfExp_847_856" id="typeOfExp_916_925" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_992_993" id="s_926_927" title="Referenced at line 39"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Fun_225_228" id="Fun_929_932" title="Defined at line 10"><span class="token sort_OpId">Fun</span></a>(<span class="cons_Var"><a href="#x_1012_1013" id="x_933_934" title="Referenced at line 40, 40, 40, 40"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#S_1033_1034" id="S_936_937" title="Referenced at line 40"><span class="token sort_OpId">S</span></a></span>, <span class="cons_Var"><a href="#e_1057_1058" id="e_939_940" title="Referenced at line 41"><span class="token sort_ConstraintId">e</span></a></span>)) = <a href="#FUN_661_664" id="FUN_945_948" title="Defined at line 20"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var">S</span>, <span class="cons_Var"><a href="#T_1063_1064" id="T_952_953" title="Referenced at line 41"><span class="token sort_OpId">T</span></a></span>) :- {<span class="cons_Var"><a href="#s_fun_974_979" id="s_fun_959_964" title="Referenced at line 39, 39, 40, 40, 41"><span class="token sort_ConstraintId">s_fun</span></a></span>}
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_fun_959_964" id="s_fun_974_979" title="Defined at line 38"><span class="token sort_ConstraintId">s_fun</span></a></span>, <span class="cons_Var"><a href="#s_fun_959_964" id="s_fun_981_986" title="Defined at line 38"><span class="token sort_ConstraintId">s_fun</span></a></span> -<a href="#P_799_800" id="P_988_989" title="Defined at line 29"><span class="token sort_OpId">P</span></a>-&gt; <span class="cons_Var"><a href="#s_926_927" id="s_992_993" title="Defined at line 38"><span class="token sort_ConstraintId">s</span></a></span>,
    <span class="token sort_ConstraintId">s_fun</span> -&gt; <span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#typeOfDecl_705_715" id="typeOfDecl_1022_1032" title="Defined at line 23"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="cons_Var"><a href="#S_936_937" id="S_1033_1034" title="Defined at line 38"><span class="token sort_OpId">S</span></a></span>,
    <a href="#typeOfExp_847_856" id="typeOfExp_1040_1049" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_fun_959_964" id="s_fun_1050_1055" title="Defined at line 38"><span class="token sort_ConstraintId">s_fun</span></a></span>, <span class="cons_Var"><a href="#e_939_940" id="e_1057_1058" title="Defined at line 38"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_952_953" id="T_1063_1064" title="Defined at line 38"><span class="token sort_OpId">T</span></a></span>.

  <a href="#typeOfExp_847_856" id="typeOfExp_1069_1078" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1133_1134" id="s_1079_1080" title="Referenced at line 44"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Var_303_306" id="Var_1082_1085" title="Defined at line 11"><span class="token sort_OpId">Var</span></a>(<span class="cons_Var"><a href="#x_1125_1126" id="x_1086_1087" title="Referenced at line 44, 44, 44, 44, 44, 44"><span class="token sort_ConstraintId">x</span></a></span>)) = <span class="cons_Var"><a href="#T_1148_1149" id="T_1092_1093" title="Referenced at line 44"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#p_1141_1142" id="p_1098_1099" title="Referenced at line 44"><span class="token sort_ConstraintId">p</span></a></span> <span class="cons_Var"><a href="#d_1145_1146" id="d_1100_1101" title="Referenced at line 44"><span class="token sort_ConstraintId">d</span></a></span>}
    <a href="#typeOfDecl_705_715" id="typeOfDecl_1107_1117" title="Defined at line 23"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="token keyword">of</span> <a href="#Var_813_816" id="Var_1121_1124" title="Defined at line 30"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_1086_1087" id="x_1125_1126" title="Defined at line 43"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#x_1086_1087" id="x_1127_1128" title="Defined at line 43"><span class="token sort_ConstraintId">x</span></a></span>} <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_1079_1080" id="s_1133_1134" title="Defined at line 43"><span class="token sort_ConstraintId">s</span></a></span> |-&gt; [(<span class="cons_Var"><a href="#p_1098_1099" id="p_1141_1142" title="Defined at line 43"><span class="token sort_ConstraintId">p</span></a></span>, (<span class="cons_Var"><a href="#d_1100_1101" id="d_1145_1146" title="Defined at line 43"><span class="token sort_ConstraintId">d</span></a></span>, <span class="cons_Var"><a href="#T_1092_1093" id="T_1148_1149" title="Defined at line 43"><span class="token sort_OpId">T</span></a></span>))].

  <a href="#typeOfExp_847_856" id="typeOfExp_1157_1166" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1210_1211" id="s_1167_1168" title="Referenced at line 47, 48"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#App_361_364" id="App_1170_1173" title="Defined at line 12"><span class="token sort_OpId">App</span></a>(<span class="cons_Var"><a href="#e1_1213_1215" id="e1_1174_1176" title="Referenced at line 47"><span class="token sort_ConstraintId">e1</span></a></span>, <span class="cons_Var"><a href="#e2_1248_1250" id="e2_1178_1180" title="Referenced at line 48"><span class="token sort_ConstraintId">e2</span></a></span>)) = <span class="cons_Var"><a href="#T_1227_1228" id="T_1185_1186" title="Referenced at line 47"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#S_1224_1225" id="S_1191_1192" title="Referenced at line 47, 49"><span class="token sort_OpId">S</span></a></span> <span class="cons_Var"><a href="#U_1255_1256" id="U_1193_1194" title="Referenced at line 48, 49"><span class="token sort_OpId">U</span></a></span>}
    <a href="#typeOfExp_847_856" id="typeOfExp_1200_1209" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1167_1168" id="s_1210_1211" title="Defined at line 46"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e1_1174_1176" id="e1_1213_1215" title="Defined at line 46"><span class="token sort_ConstraintId">e1</span></a></span>) == <a href="#FUN_661_664" id="FUN_1220_1223" title="Defined at line 20"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#S_1191_1192" id="S_1224_1225" title="Defined at line 46"><span class="token sort_OpId">S</span></a></span>, <span class="cons_Var"><a href="#T_1185_1186" id="T_1227_1228" title="Defined at line 46"><span class="token sort_OpId">T</span></a></span>),
    <a href="#typeOfExp_847_856" id="typeOfExp_1235_1244" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1167_1168" id="s_1245_1246" title="Defined at line 46"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e2_1178_1180" id="e2_1248_1250" title="Defined at line 46"><span class="token sort_ConstraintId">e2</span></a></span>) == <span class="cons_Var"><a href="#U_1193_1194" id="U_1255_1256" title="Defined at line 46"><span class="token sort_OpId">U</span></a></span>,
    <span class="cons_Var"><a href="#U_1193_1194" id="U_1262_1263" title="Defined at line 46"><span class="token sort_OpId">U</span></a></span> == <span class="cons_Var"><a href="#S_1191_1192" id="S_1267_1268" title="Defined at line 46"><span class="token sort_OpId">S</span></a></span>.

  <a href="#typeOfExp_847_856" id="typeOfExp_1273_1282" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1342_1343" id="s_1283_1284" title="Referenced at line 52, 53"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Let_423_426" id="Let_1286_1289" title="Defined at line 13"><span class="token sort_OpId">Let</span></a>(<span class="cons_Var"><a href="#binds_1360_1365" id="binds_1290_1295" title="Referenced at line 53, 55"><span class="token sort_ConstraintId">binds</span></a></span>, <span class="cons_Var"><a href="#e_1396_1397" id="e_1297_1298" title="Referenced at line 54"><span class="token sort_ConstraintId">e</span></a></span>)) = <span class="cons_Var"><a href="#T_1402_1403" id="T_1303_1304" title="Referenced at line 54"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#s_let_1324_1329" id="s_let_1309_1314" title="Referenced at line 52, 52, 53, 54"><span class="token sort_ConstraintId">s_let</span></a></span>}
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_let_1309_1314" id="s_let_1324_1329" title="Defined at line 51"><span class="token sort_ConstraintId">s_let</span></a></span>, <span class="cons_Var"><a href="#s_let_1309_1314" id="s_let_1331_1336" title="Defined at line 51"><span class="token sort_ConstraintId">s_let</span></a></span> -<a href="#P_799_800" id="P_1338_1339" title="Defined at line 29"><span class="token sort_OpId">P</span></a>-&gt; <span class="cons_Var"><a href="#s_1283_1284" id="s_1342_1343" title="Defined at line 51"><span class="token sort_ConstraintId">s</span></a></span>,
    <a href="#bindsOk_1575_1582" id="bindsOk_1349_1356" title="Defined at line 63"><span class="token sort_ConstraintId">bindsOk</span></a>(<span class="cons_Var"><a href="#s_1283_1284" id="s_1357_1358" title="Defined at line 51"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#binds_1290_1295" id="binds_1360_1365" title="Defined at line 51"><span class="token sort_ConstraintId">binds</span></a></span>, <span class="cons_Var"><a href="#s_let_1309_1314" id="s_let_1367_1372" title="Defined at line 51"><span class="token sort_ConstraintId">s_let</span></a></span>),
    <a href="#typeOfExp_847_856" id="typeOfExp_1379_1388" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_let_1309_1314" id="s_let_1389_1394" title="Defined at line 51"><span class="token sort_ConstraintId">s_let</span></a></span>, <span class="cons_Var"><a href="#e_1297_1298" id="e_1396_1397" title="Defined at line 51"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_1303_1304" id="T_1402_1403" title="Defined at line 51"><span class="token sort_OpId">T</span></a></span>,
    <span class="cons_Var"><a href="#binds_1290_1295" id="binds_1409_1414" title="Defined at line 51"><span class="token sort_ConstraintId">binds</span></a></span> != []. <span class="token layout">// additive</span>

  <a href="#bindOk_1470_1476" id="bindOk_1437_1443" title="Referenced at line 59, 63"><span class="token sort_ConstraintId">bindOk</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Bind_498_502" id="Bind_1454_1458" title="Defined at line 15"><span class="token sort_OpId">Bind</span></a></span> * <span class="token sort_ConstraintId">scope</span>

  <a href="#bindOk_1437_1443" id="bindOk_1470_1476" title="Defined at line 57"><span class="token sort_ConstraintId">bindOk</span></a>(<span class="cons_Var"><a href="#s_1560_1561" id="s_1477_1478" title="Referenced at line 61"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Bind_548_552" id="Bind_1480_1484" title="Defined at line 16"><span class="token sort_OpId">Bind</span></a>(<span class="cons_Var"><a href="#x_1522_1523" id="x_1485_1486" title="Referenced at line 60, 60, 60, 60"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#T_1543_1544" id="T_1488_1489" title="Referenced at line 60, 61"><span class="token sort_OpId">T</span></a></span>, <span class="cons_Var"><a href="#e_1563_1564" id="e_1491_1492" title="Referenced at line 61"><span class="token sort_ConstraintId">e</span></a></span>), <span class="cons_Var"><a href="#s_bnd_1509_1514" id="s_bnd_1495_1500" title="Referenced at line 60, 60"><span class="token sort_ConstraintId">s_bnd</span></a></span>) :-
    <span class="token sort_ConstraintId">s_bnd</span> -&gt; <span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#typeOfDecl_705_715" id="typeOfDecl_1532_1542" title="Defined at line 23"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="cons_Var"><a href="#T_1488_1489" id="T_1543_1544" title="Defined at line 59"><span class="token sort_OpId">T</span></a></span>,
    <a href="#typeOfExp_847_856" id="typeOfExp_1550_1559" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1477_1478" id="s_1560_1561" title="Defined at line 59"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e_1491_1492" id="e_1563_1564" title="Defined at line 59"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_1488_1489" id="T_1569_1570" title="Defined at line 59"><span class="token sort_OpId">T</span></a></span>.

  <a href="#bindsOk_1349_1356" id="bindsOk_1575_1582" title="Referenced at line 53"><span class="token sort_ConstraintId">bindsOk</span></a> <span class="token keyword">maps</span> <a href="#bindOk_1437_1443" id="bindOk_1588_1594" title="Defined at line 57"><span class="token sort_ConstraintId">bindOk</span></a>(*, <span class="token sort_ConstraintId">list</span>(*), *)

</code></pre></td></tr></tbody></table></div>