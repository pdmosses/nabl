---
title: stlc.stx
hide:
  - toc
---

# `stlc.stx`

:simple-github: [pdmosses/nabl/statix.example/src/stlc.stx]

[pdmosses/nabl/statix.example/src/stlc.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/stlc.stx "The source file on GitHub"

<div class="stx"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
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
</pre></div></td>
<td class="code"><pre><code><span class="token keyword">module</span> <span id="stlc_7_11" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">stlc</span></span> <span class="token layout">// Static semantics of Simply Typed Lambda Calculus</span>

<span class="token keyword">signature</span>
  <span class="token sort_ConstraintId">sorts</span> <a href="#ID_247_249" id="ID_83_85" title="Referenced at line 8, 10, 11"><span class="token sort_OpId">ID</span></a> = <span class="token sort_ConstraintId">string</span>                         <span class="token layout">// $x$</span>
  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#BinOp_311_316" id="BinOp_134_139" title="Referenced at line 9"><span class="token sort_OpId">BinOp</span></a></span>                               <span class="token layout">// $op$</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Exp_253_256" id="Exp_187_190" title="Referenced at line 8, 9, 9, 9, 10, 10, 11, 12, 12, 12, 34"><span class="token sort_OpId">Exp</span></a></span> <span class="token sort_ConstraintId">constructors</span>                    <span class="token layout">// $e$ :=</span>
    <a href="#Num_1029_1032" id="Num_237_240" title="Referenced at line 36"><span class="token sort_OpId">Num</span></a>     : <span class="cons_SimpleSort"><a href="#ID_83_85" id="ID_247_249" title="Defined at line 4"><span class="token sort_OpId">ID</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_253_256" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span>                     <span class="token layout">//      | $n$</span>
    <a href="#BinExp_1062_1068" id="BinExp_295_301" title="Referenced at line 38"><span class="token sort_OpId">BinExp</span></a>  : <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_305_308" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span> * <span class="cons_SimpleSort"><a href="#BinOp_134_139" id="BinOp_311_316" title="Defined at line 5"><span class="token sort_OpId">BinOp</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_319_322" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_326_329" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span>      <span class="token layout">//      | $e$ $\oplus$ $e$</span>
    <a href="#Fun_1170_1173" id="Fun_366_369" title="Referenced at line 42"><span class="token sort_OpId">Fun</span></a>     : <span class="cons_SimpleSort"><a href="#ID_83_85" id="ID_376_378" title="Defined at line 4"><span class="token sort_OpId">ID</span></a></span> * <span class="cons_SimpleSort"><a href="#TypeExp_570_577" id="TypeExp_381_388" title="Defined at line 14"><span class="token sort_OpId">TypeExp</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_391_394" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_398_401" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span>     <span class="token layout">//      | fun ($x$ : $te$) { $e$ }</span>
    <a href="#Var_1355_1358" id="Var_445_448" title="Referenced at line 48"><span class="token sort_OpId">Var</span></a>     : <span class="cons_SimpleSort"><a href="#ID_83_85" id="ID_455_457" title="Defined at line 4"><span class="token sort_OpId">ID</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_461_464" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span>                     <span class="token layout">//      | $x$</span>
    <a href="#App_1437_1440" id="App_503_506" title="Referenced at line 51"><span class="token sort_OpId">App</span></a>     : <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_513_516" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span> * <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_519_522" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_526_529" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span>              <span class="token layout">//      | $e$ $e$</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#TypeExp_381_388" id="TypeExp_570_577" title="Referenced at line 10, 15, 16, 16, 16, 58"><span class="token sort_OpId">TypeExp</span></a></span> <span class="token sort_ConstraintId">constructors</span>                <span class="token layout">// $te$ :=</span>
    <a href="#NumType_1608_1615" id="NumType_621_628" title="Referenced at line 60"><span class="token sort_OpId">NumType</span></a> : <span class="cons_SimpleSort"><a href="#TypeExp_570_577" id="TypeExp_631_638" title="Defined at line 14"><span class="token sort_OpId">TypeExp</span></a></span>                       <span class="token layout">//       | num</span>
    <a href="#FunType_1648_1655" id="FunType_680_687" title="Referenced at line 62"><span class="token sort_OpId">FunType</span></a> : <span class="cons_SimpleSort"><a href="#TypeExp_570_577" id="TypeExp_690_697" title="Defined at line 14"><span class="token sort_OpId">TypeExp</span></a></span> * <span class="cons_SimpleSort"><a href="#TypeExp_570_577" id="TypeExp_700_707" title="Defined at line 14"><span class="token sort_OpId">TypeExp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#TypeExp_570_577" id="TypeExp_711_718" title="Defined at line 14"><span class="token sort_OpId">TypeExp</span></a></span>  <span class="token layout">//       | $te$ -&gt; $te$</span>

  <span class="token sort_ConstraintId">sorts</span> <span class="cons_SortDecl"><a href="#Type_783_787" id="Type_753_757" title="Referenced at line 19, 20, 20, 20, 23, 34, 58"><span class="token sort_OpId">Type</span></a></span> <span class="token sort_ConstraintId">constructors</span>
    <a href="#NUM_1039_1042" id="NUM_775_778" title="Referenced at line 36, 38, 39, 40, 60"><span class="token sort_OpId">NUM</span></a>   : <span class="cons_SimpleSort"><a href="#Type_753_757" id="Type_783_787" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>
    <a href="#FUN_1187_1190" id="FUN_792_795" title="Referenced at line 42, 52, 62"><span class="token sort_OpId">FUN</span></a>   : <span class="cons_SimpleSort"><a href="#Type_753_757" id="Type_800_804" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span> * <span class="cons_SimpleSort"><a href="#Type_753_757" id="Type_807_811" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_753_757" id="Type_815_819" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>

  <span class="token keyword">relations</span>
    <a href="#typeOfDecl_1295_1305" id="typeOfDecl_837_847" title="Referenced at line 45, 49"><span class="token sort_ConstraintId">typeOfDecl</span></a> : <span class="token sort_ConstraintId">occurrence</span> -&gt; <span class="cons_SimpleSort"><a href="#Type_753_757" id="Type_864_868" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>

  <span class="token keyword">namespaces</span>
    <a href="#Var_947_950" id="Var_887_890" title="Referenced at line 30, 45, 45, 49, 49, 49"><span class="token sort_OpId">Var</span></a>  : <span class="token sort_ConstraintId">string</span>

  <span class="token keyword">name-resolution</span>
    <span class="token keyword">labels</span> <a href="#P_958_959" id="P_931_932" title="Referenced at line 30, 30, 44"><span class="token sort_OpId">P</span></a> <span id="R_933_934" title="Not referenced locally, nor via imports"><span class="token sort_OpId">R</span></span>
    <span class="token keyword">resolve</span> <a href="#Var_887_890" id="Var_947_950" title="Defined at line 26"><span class="token sort_OpId">Var</span></a> <span class="token keyword">filter</span> <a href="#P_931_932" id="P_958_959" title="Defined at line 29"><span class="token sort_OpId">P</span></a>* <span class="token keyword">min</span> $ &lt; <a href="#P_931_932" id="P_969_970" title="Defined at line 29"><span class="token sort_OpId">P</span></a>

<span class="token keyword">rules</span>

  <a href="#typeOfExp_1016_1025" id="typeOfExp_981_990" title="Referenced at line 36, 38, 39, 40, 42, 46, 48, 51, 52, 53"><span class="token sort_ConstraintId">typeOfExp</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#Exp_187_190" id="Exp_1001_1004" title="Defined at line 7"><span class="token sort_OpId">Exp</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="#Type_753_757" id="Type_1008_1012" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>

  <a href="#typeOfExp_981_990" id="typeOfExp_1016_1025" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><span id="s_1026_1027" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <a href="#Num_237_240" id="Num_1029_1032" title="Defined at line 8"><span class="token sort_OpId">Num</span></a>(_)) = <a href="#NUM_775_778" id="NUM_1039_1042" title="Defined at line 19"><span class="token sort_OpId">NUM</span></a>().

  <a href="#typeOfExp_981_990" id="typeOfExp_1049_1058" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1106_1107" id="s_1059_1060" title="Referenced at line 39, 40"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#BinExp_295_301" id="BinExp_1062_1068" title="Defined at line 9"><span class="token sort_OpId">BinExp</span></a>(<span class="cons_Var"><a href="#e1_1109_1111" id="e1_1069_1071" title="Referenced at line 39"><span class="token sort_ConstraintId">e1</span></a></span>, _, <span class="cons_Var"><a href="#e2_1140_1142" id="e2_1076_1078" title="Referenced at line 40"><span class="token sort_ConstraintId">e2</span></a></span>)) = <a href="#NUM_775_778" id="NUM_1083_1086" title="Defined at line 19"><span class="token sort_OpId">NUM</span></a>() :-
    <a href="#typeOfExp_981_990" id="typeOfExp_1096_1105" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1059_1060" id="s_1106_1107" title="Defined at line 38"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e1_1069_1071" id="e1_1109_1111" title="Defined at line 38"><span class="token sort_ConstraintId">e1</span></a></span>) == <a href="#NUM_775_778" id="NUM_1116_1119" title="Defined at line 19"><span class="token sort_OpId">NUM</span></a>(),
    <a href="#typeOfExp_981_990" id="typeOfExp_1127_1136" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1059_1060" id="s_1137_1138" title="Defined at line 38"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e2_1076_1078" id="e2_1140_1142" title="Defined at line 38"><span class="token sort_ConstraintId">e2</span></a></span>) == <a href="#NUM_775_778" id="NUM_1147_1150" title="Defined at line 19"><span class="token sort_OpId">NUM</span></a>().

  <a href="#typeOfExp_981_990" id="typeOfExp_1157_1166" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1226_1227" id="s_1167_1168" title="Referenced at line 43, 44"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Fun_366_369" id="Fun_1170_1173" title="Defined at line 10"><span class="token sort_OpId">Fun</span></a>(<span class="cons_Var"><a href="#x_1285_1286" id="x_1174_1175" title="Referenced at line 45, 45, 45, 45"><span class="token sort_ConstraintId">x</span></a></span>, <span class="cons_Var"><a href="#te_1229_1231" id="te_1177_1179" title="Referenced at line 43"><span class="token sort_ConstraintId">te</span></a></span>, <span class="cons_Var"><a href="#e_1330_1331" id="e_1181_1182" title="Referenced at line 46"><span class="token sort_ConstraintId">e</span></a></span>)) = <a href="#FUN_792_795" id="FUN_1187_1190" title="Defined at line 20"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#S_1236_1237" id="S_1191_1192" title="Referenced at line 43, 45"><span class="token sort_OpId">S</span></a></span>, <span class="cons_Var"><a href="#T_1336_1337" id="T_1194_1195" title="Referenced at line 46"><span class="token sort_OpId">T</span></a></span>) :- {<span class="cons_Var"><a href="#s_fun_1247_1252" id="s_fun_1201_1206" title="Referenced at line 44, 44, 45, 45, 46"><span class="token sort_ConstraintId">s_fun</span></a></span>}
    <a href="#typeOfTypeExp_1547_1560" id="typeOfTypeExp_1212_1225" title="Defined at line 58"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><a href="#s_1167_1168" id="s_1226_1227" title="Defined at line 42"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#te_1177_1179" id="te_1229_1231" title="Defined at line 42"><span class="token sort_ConstraintId">te</span></a></span>) == <span class="cons_Var"><a href="#S_1191_1192" id="S_1236_1237" title="Defined at line 42"><span class="token sort_OpId">S</span></a></span>,
    <span class="token keyword">new</span> <span class="cons_Var"><a href="#s_fun_1201_1206" id="s_fun_1247_1252" title="Defined at line 42"><span class="token sort_ConstraintId">s_fun</span></a></span>, <span class="cons_Var"><a href="#s_fun_1201_1206" id="s_fun_1254_1259" title="Defined at line 42"><span class="token sort_ConstraintId">s_fun</span></a></span> -<a href="#P_931_932" id="P_1261_1262" title="Defined at line 29"><span class="token sort_OpId">P</span></a>-&gt; <span class="cons_Var"><a href="#s_1167_1168" id="s_1265_1266" title="Defined at line 42"><span class="token sort_ConstraintId">s</span></a></span>,
    <span class="token sort_ConstraintId">s_fun</span> -&gt; <span class="token sort_OpId">Var</span>{<span class="token sort_ConstraintId">x</span>@<span class="token sort_ConstraintId">x</span>} <span class="token keyword">with</span> <a href="#typeOfDecl_837_847" id="typeOfDecl_1295_1305" title="Defined at line 23"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="cons_Var"><a href="#S_1191_1192" id="S_1306_1307" title="Defined at line 42"><span class="token sort_OpId">S</span></a></span>,
    <a href="#typeOfExp_981_990" id="typeOfExp_1313_1322" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_fun_1201_1206" id="s_fun_1323_1328" title="Defined at line 42"><span class="token sort_ConstraintId">s_fun</span></a></span>, <span class="cons_Var"><a href="#e_1181_1182" id="e_1330_1331" title="Defined at line 42"><span class="token sort_ConstraintId">e</span></a></span>) == <span class="cons_Var"><a href="#T_1194_1195" id="T_1336_1337" title="Defined at line 42"><span class="token sort_OpId">T</span></a></span>.

  <a href="#typeOfExp_981_990" id="typeOfExp_1342_1351" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1400_1401" id="s_1352_1353" title="Referenced at line 49"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#Var_445_448" id="Var_1355_1358" title="Defined at line 11"><span class="token sort_OpId">Var</span></a>(<span class="cons_Var"><a href="#x_1392_1393" id="x_1359_1360" title="Referenced at line 49, 49, 49, 49, 49, 49"><span class="token sort_ConstraintId">x</span></a></span>)) = <span class="cons_Var"><a href="#T_1415_1416" id="T_1365_1366" title="Referenced at line 49"><span class="token sort_OpId">T</span></a></span> :-
    <a href="#typeOfDecl_837_847" id="typeOfDecl_1374_1384" title="Defined at line 23"><span class="token sort_ConstraintId">typeOfDecl</span></a> <span class="token keyword">of</span> <a href="#Var_887_890" id="Var_1388_1391" title="Defined at line 26"><span class="token sort_OpId">Var</span></a>{<span class="cons_Var"><a href="#x_1359_1360" id="x_1392_1393" title="Defined at line 48"><span class="token sort_ConstraintId">x</span></a></span>@<span class="cons_Var"><a href="#x_1359_1360" id="x_1394_1395" title="Defined at line 48"><span class="token sort_ConstraintId">x</span></a></span>} <span class="token keyword">in</span> <span class="cons_Var"><a href="#s_1352_1353" id="s_1400_1401" title="Defined at line 48"><span class="token sort_ConstraintId">s</span></a></span> |-&gt; [(_, (_, <span class="cons_Var"><a href="#T_1365_1366" id="T_1415_1416" title="Defined at line 48"><span class="token sort_OpId">T</span></a></span>))].

  <a href="#typeOfExp_981_990" id="typeOfExp_1424_1433" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1477_1478" id="s_1434_1435" title="Referenced at line 52, 53"><span class="token sort_ConstraintId">s</span></a></span>, <a href="#App_503_506" id="App_1437_1440" title="Defined at line 12"><span class="token sort_OpId">App</span></a>(<span class="cons_Var"><a href="#e1_1480_1482" id="e1_1441_1443" title="Referenced at line 52"><span class="token sort_ConstraintId">e1</span></a></span>, <span class="cons_Var"><a href="#e2_1515_1517" id="e2_1445_1447" title="Referenced at line 53"><span class="token sort_ConstraintId">e2</span></a></span>)) = <span class="cons_Var"><a href="#T_1494_1495" id="T_1452_1453" title="Referenced at line 52"><span class="token sort_OpId">T</span></a></span> :- {<span class="cons_Var"><a href="#S_1491_1492" id="S_1458_1459" title="Referenced at line 52, 54"><span class="token sort_OpId">S</span></a></span> <span class="cons_Var"><a href="#U_1522_1523" id="U_1460_1461" title="Referenced at line 53, 54"><span class="token sort_OpId">U</span></a></span>}
    <a href="#typeOfExp_981_990" id="typeOfExp_1467_1476" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1434_1435" id="s_1477_1478" title="Defined at line 51"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e1_1441_1443" id="e1_1480_1482" title="Defined at line 51"><span class="token sort_ConstraintId">e1</span></a></span>) == <a href="#FUN_792_795" id="FUN_1487_1490" title="Defined at line 20"><span class="token sort_OpId">FUN</span></a>(<span class="cons_Var"><a href="#S_1458_1459" id="S_1491_1492" title="Defined at line 51"><span class="token sort_OpId">S</span></a></span>, <span class="cons_Var"><a href="#T_1452_1453" id="T_1494_1495" title="Defined at line 51"><span class="token sort_OpId">T</span></a></span>),
    <a href="#typeOfExp_981_990" id="typeOfExp_1502_1511" title="Defined at line 34"><span class="token sort_ConstraintId">typeOfExp</span></a>(<span class="cons_Var"><a href="#s_1434_1435" id="s_1512_1513" title="Defined at line 51"><span class="token sort_ConstraintId">s</span></a></span>, <span class="cons_Var"><a href="#e2_1445_1447" id="e2_1515_1517" title="Defined at line 51"><span class="token sort_ConstraintId">e2</span></a></span>) == <span class="cons_Var"><a href="#U_1460_1461" id="U_1522_1523" title="Defined at line 51"><span class="token sort_OpId">U</span></a></span>,
    <span class="cons_Var"><a href="#U_1460_1461" id="U_1529_1530" title="Defined at line 51"><span class="token sort_OpId">U</span></a></span> == <span class="cons_Var"><a href="#S_1458_1459" id="S_1534_1535" title="Defined at line 51"><span class="token sort_OpId">S</span></a></span>.

<span class="token keyword">rules</span>

  <a href="#typeOfTypeExp_1212_1225" id="typeOfTypeExp_1547_1560" title="Referenced at line 43, 60, 62, 62, 62"><span class="token sort_ConstraintId">typeOfTypeExp</span></a> : <span class="token sort_ConstraintId">scope</span> * <span class="cons_SimpleSort"><a href="#TypeExp_570_577" id="TypeExp_1571_1578" title="Defined at line 14"><span class="token sort_OpId">TypeExp</span></a></span> -&gt;  <span class="cons_SimpleSort"><a href="#Type_753_757" id="Type_1583_1587" title="Defined at line 18"><span class="token sort_OpId">Type</span></a></span>

  <a href="#typeOfTypeExp_1547_1560" id="typeOfTypeExp_1591_1604" title="Defined at line 58"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><span id="s_1605_1606" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <a href="#NumType_621_628" id="NumType_1608_1615" title="Defined at line 15"><span class="token sort_OpId">NumType</span></a>()) = <a href="#NUM_775_778" id="NUM_1621_1624" title="Defined at line 19"><span class="token sort_OpId">NUM</span></a>().

  <a href="#typeOfTypeExp_1547_1560" id="typeOfTypeExp_1631_1644" title="Defined at line 58"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var">s</span>, <a href="#FunType_680_687" id="FunType_1648_1655" title="Defined at line 16"><span class="token sort_OpId">FunType</span></a>(<span class="cons_Var">te1</span>, <span class="cons_Var">te2</span>)) = <a href="#FUN_792_795" id="FUN_1669_1672" title="Defined at line 20"><span class="token sort_OpId">FUN</span></a>(<a href="#typeOfTypeExp_1547_1560" id="typeOfTypeExp_1673_1686" title="Defined at line 58"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var">s</span>, <span class="cons_Var"><span id="te1_1690_1693" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">te1</span></span></span>), <a href="#typeOfTypeExp_1547_1560" id="typeOfTypeExp_1696_1709" title="Defined at line 58"><span class="token sort_ConstraintId">typeOfTypeExp</span></a>(<span class="cons_Var"><span id="s_1710_1711" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <span class="cons_Var"><span id="te2_1713_1716" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">te2</span></span></span>)).

</code></pre></td></tr></tbody></table></div>