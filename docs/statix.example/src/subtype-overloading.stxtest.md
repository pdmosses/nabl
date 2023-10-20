---
title: subtype-overloading.stxtest
hide:
  - toc
---

# `subtype-overloading.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/subtype-overloading.stxtest]

[pdmosses/nabl/statix.example/src/subtype-overloading.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/subtype-overloading.stxtest "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="layout">/** Type-based overload resolution with subtyping
                      * Goal:
                      * Result:
                      * - Function resolution does select compatible functions based on the `subType`
                      *   relation.
                      * - Currently there is now way to select the _best_ compatible function.
                      */</span>
<span class="keyword">resolve</span> <span class="operator">{</span><span class="cons_Var"><a href="#s_270_271" id="s_253_254" title="Referenced at line 10, 11, 12, 13, 14"><span class="token sort_Id">s</span></a></span> <span class="cons_Var"><a href="#result_425_431" id="result_255_261" title="Referenced at line 14"><span class="token sort_Id">result</span></a></span><span class="operator">}</span>

  <span class="keyword">new</span> <span class="cons_Var"><a href="#s_253_254" id="s_270_271" title="Defined at line 8"><span class="token sort_Id">s</span></a></span><span class="operator">,</span>
  <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Fun</span><span class="operator">{"</span><span class="token sort_Id">f</span><span class="operator">"@-}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#funType_580_587" id="funType_296_303" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span> <span class="cons_Op"><a href="#INT_495_498" id="INT_304_307" title="Defined at line 21"><span class="token sort_Id">INT</span></a>()</span><span class="operator">,</span>
  <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Fun</span><span class="operator">{"</span><span class="token sort_Id">f</span><span class="operator">"@-}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#funType_580_587" id="funType_334_341" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span> <span class="cons_Op"><a href="#NAT_510_513" id="NAT_342_345" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">,</span>
  <span class="token sort_Id">s</span> <span class="operator">-&gt;</span> <span class="token sort_Id">Fun</span><span class="operator">{"</span><span class="token sort_Id">f</span><span class="operator">"@-}</span> <span class="keyword">with</span> <span class="cons_Label"><a href="#funType_580_587" id="funType_372_379" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span> <span class="cons_Op"><a href="#POS_525_528" id="POS_380_383" title="Defined at line 23"><span class="token sort_Id">POS</span></a>()</span><span class="operator">,</span>
  <a href="#resolveFun_618_628" id="resolveFun_389_399" title="Defined at line 33"><span class="token sort_Id">resolveFun</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_253_254" id="s_400_401" title="Defined at line 8"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_StxOccurrence"><a href="#Fun_554_557" id="Fun_403_406" title="Defined at line 26"><span class="token sort_Id">Fun</span></a><span class="operator">{</span><span class="cons_Str"><span class="operator">"</span>f"</span>@-}</span><span class="operator">,</span> <span class="cons_Op"><a href="#NAT_510_513" id="NAT_415_418" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">)</span> <span class="operator">==</span> <span class="cons_Var"><a href="#result_255_261" id="result_425_431" title="Defined at line 8"><span class="token sort_Id">result</span></a></span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortAlias"><a href="#ID_560_562" id="ID_452_454" title="Referenced at line 26"><span class="token sort_Id">ID</span></a> <span class="operator">=</span> <span class="cons_StringSort">string</span></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#TYPE_501_505" id="TYPE_473_477" title="Referenced at line 21, 22, 23, 29, 33, 44, 54"><span class="token sort_Id">TYPE</span></a></span> <span class="keyword">constructors</span>
    <span class="cons_OpDecl"><a href="#INT_304_307" id="INT_495_498" title="Referenced at line 11, 48, 49"><span class="token sort_Id">INT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_501_505" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="#NAT_342_345" id="NAT_510_513" title="Referenced at line 12, 14, 47, 49"><span class="token sort_Id">NAT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_516_520" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span></span>
    <span class="cons_OpDecl"><a href="#POS_380_383" id="POS_525_528" title="Referenced at line 13, 47, 48"><span class="token sort_Id">POS</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_531_535" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span></span>

  <span class="keyword">namespaces</span>
    <span class="cons_NsDecl"><a href="#Fun_280_283" id="Fun_554_557" title="Referenced at line 11, 12, 13, 14, 35, 37"><span class="token sort_Id">Fun</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#ID_452_454" id="ID_560_562" title="Defined at line 18"><span class="token sort_Id">ID</span></a></span></span>

  <span class="keyword">relations</span>
    <span class="cons_Label"><a href="#funType_296_303" id="funType_580_587" title="Referenced at line 11, 12, 13, 36"><span class="token sort_Id">funType</span></a></span> <span class="operator">:</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_603_607" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span>

<span class="keyword">rules</span>

  <a href="#resolveFun_389_399" id="resolveFun_618_628" title="Referenced at line 14, 35"><span class="token sort_Id">resolveFun</span></a> <span class="operator">:</span> <span class="cons_ScopeSort">scope</span> <span class="operator">*</span> <span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_652_656" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">-&gt;</span> <span class="keyword">list</span><span class="operator">((</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_679_683" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span><span class="operator">))</span>

  <a href="#resolveFun_618_628" id="resolveFun_689_699" title="Defined at line 33"><span class="token sort_Id">resolveFun</span></a><span class="operator">(</span><span class="cons_Var"><a href="#s_883_884" id="s_700_701" title="Referenced at line 39"><span class="token sort_Id">s</span></a></span><span class="operator">,</span> <span class="cons_StxOccurrence"><a href="#Fun_554_557" id="Fun_703_706" title="Defined at line 26"><span class="token sort_Id">Fun</span></a><span class="operator">{</span><span class="cons_Var"><a href="#x_796_797" id="x_707_708" title="Referenced at line 37"><span class="token sort_Id">x</span></a></span>@_}</span><span class="operator">,</span> <span class="cons_Var"><a href="#T_812_813" id="T_713_714" title="Referenced at line 37"><span class="token sort_Id">T</span></a></span><span class="operator">)</span> <span class="operator">=</span> <a href="#pots2ots_1036_1044" id="pots2ots_718_726" title="Defined at line 53"><span class="token sort_Id">pots2ots</span></a><span class="operator">(</span><span class="cons_Var"><a href="#funs_895_899" id="funs_727_731" title="Referenced at line 40"><span class="token sort_Id">funs</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <span class="operator">{}</span>
    <span class="keyword">query</span> <span class="cons_Label"><a href="#funType_580_587" id="funType_749_756" title="Defined at line 29"><span class="token sort_Id">funType</span></a></span>
      <span class="keyword">filter</span> <span class="operator">~</span>0 <span class="keyword">and</span> <span class="operator">{</span> <span class="operator">(</span><span class="cons_StxOccurrence"><a href="#Fun_554_557" id="Fun_780_783" title="Defined at line 26"><span class="token sort_Id">Fun</span></a><span class="operator">{</span><span class="cons_Var"><a href="#y_801_802" id="y_784_785" title="Referenced at line 37"><span class="token sort_Id">y</span></a></span>@_}</span><span class="operator">,</span> <span class="cons_Var"><a href="#U_815_816" id="U_790_791" title="Referenced at line 37"><span class="token sort_Id">U</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <span class="cons_Var"><a href="#x_707_708" id="x_796_797" title="Defined at line 35"><span class="token sort_Id">x</span></a></span> <span class="operator">==</span> <span class="cons_Var"><a href="#y_784_785" id="y_801_802" title="Defined at line 37"><span class="token sort_Id">y</span></a></span><span class="operator">,</span> <a href="#subType_911_918" id="subType_804_811" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Var"><a href="#T_713_714" id="T_812_813" title="Defined at line 35"><span class="token sort_Id">T</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#U_790_791" id="U_815_816" title="Defined at line 37"><span class="token sort_Id">U</span></a></span><span class="operator">)</span> <span class="operator">}</span>
      <span class="keyword">min</span> <span class="keyword">and</span> <span class="operator">{</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#T1_864_866" id="T1_840_842" title="Referenced at line 38"><span class="token sort_Id">T1</span></a></span><span class="operator">),</span> <span class="operator">(_,</span> <span class="cons_Var"><a href="#T2_868_870" id="T2_849_851" title="Referenced at line 38"><span class="token sort_Id">T2</span></a></span><span class="operator">)</span> <span class="operator">:-</span> <a href="#subType_911_918" id="subType_856_863" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Var"><a href="#T1_840_842" id="T1_864_866" title="Defined at line 38"><span class="token sort_Id">T1</span></a></span><span class="operator">,</span> <span class="cons_Var"><a href="#T2_849_851" id="T2_868_870" title="Defined at line 38"><span class="token sort_Id">T2</span></a></span><span class="operator">)</span> <span class="operator">}</span>
      <span class="keyword">in</span> <span class="cons_Var"><a href="#s_700_701" id="s_883_884" title="Defined at line 35"><span class="token sort_Id">s</span></a></span>
      <span class="operator">|-&gt;</span> <span class="cons_Var"><a href="#funs_727_731" id="funs_895_899" title="Defined at line 35"><span class="token sort_Id">funs</span></a></span><span class="operator">.</span>

<span class="keyword">rules</span>

  <a href="#subType_804_811" id="subType_911_918" title="Referenced at line 37, 38, 46, 47, 48, 49"><span class="token sort_Id">subType</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_921_925" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_928_932" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span>

  <a href="#subType_911_918" id="subType_936_943" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Var">T</span><span class="operator">,</span> <span class="cons_Var"><span id="T_947_948" title="Not referenced locally, nor via imports"><span class="token sort_Id">T</span></span></span><span class="operator">).</span>
  <a href="#subType_911_918" id="subType_953_960" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#POS_525_528" id="POS_961_964" title="Defined at line 23"><span class="token sort_Id">POS</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#NAT_510_513" id="NAT_968_971" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">).</span>
  <a href="#subType_911_918" id="subType_978_985" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#POS_525_528" id="POS_986_989" title="Defined at line 23"><span class="token sort_Id">POS</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#INT_495_498" id="INT_993_996" title="Defined at line 21"><span class="token sort_Id">INT</span></a>()</span><span class="operator">).</span>
  <a href="#subType_911_918" id="subType_1003_1010" title="Defined at line 44"><span class="token sort_Id">subType</span></a><span class="operator">(</span><span class="cons_Op"><a href="#NAT_510_513" id="NAT_1011_1014" title="Defined at line 22"><span class="token sort_Id">NAT</span></a>()</span><span class="operator">,</span> <span class="cons_Op"><a href="#INT_495_498" id="INT_1018_1021" title="Defined at line 21"><span class="token sort_Id">INT</span></a>()</span><span class="operator">).</span>

<span class="keyword">rules</span>

  <a href="#pots2ots_718_726" id="pots2ots_1036_1044" title="Referenced at line 35"><span class="token sort_Id">pots2ots</span></a> <span class="keyword">maps</span> <a href="#pot2ot_1078_1084" id="pot2ot_1050_1056" title="Defined at line 54"><span class="token sort_Id">pot2ot</span></a><span class="operator">(</span><span class="keyword">list</span><span class="operator">(*))</span> <span class="operator">=</span> <span class="keyword">list</span><span class="operator">(*)</span>
  <a href="#pot2ot_1050_1056" id="pot2ot_1078_1084" title="Referenced at line 53, 55"><span class="token sort_Id">pot2ot</span></a> <span class="operator">:</span> <span class="operator">(</span><span class="cons_PathSort">path</span> <span class="operator">*</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_1109_1113" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span><span class="operator">))</span> <span class="operator">-&gt;</span> <span class="operator">(</span><span class="cons_OccurrenceSort">occurrence</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#TYPE_473_477" id="TYPE_1133_1137" title="Defined at line 20"><span class="token sort_Id">TYPE</span></a></span><span class="operator">)</span>
  <a href="#pot2ot_1078_1084" id="pot2ot_1141_1147" title="Defined at line 54"><span class="token sort_Id">pot2ot</span></a><span class="operator">((_,</span> <span class="cons_Var">ot</span><span class="operator">))</span> <span class="operator">=</span> <span class="cons_Var"><span id="ot_1159_1161" title="Not referenced locally, nor via imports"><span class="token sort_Id">ot</span></span></span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>