---
title: busybeaver.stxtest
hide:
  - toc
---

# `busybeaver.stxtest`

:simple-github: [pdmosses/nabl/statix.example/src/busybeaver.stxtest]

[pdmosses/nabl/statix.example/src/busybeaver.stxtest]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/busybeaver.stxtest "The source file on GitHub"

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
<td class="code"><pre><code><span class="layout">// 3-state Busy Beaver Turing machine specification</span>
<span class="layout">// https://en.wikipedia.org/wiki/Turing_machine_examples#3-state_Busy_Beaver</span>

<span class="keyword">resolve</span>

  <a href="#busybeaver_480_490" id="busybeaver_141_151" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#A_218_219" id="A_152_153" title="Defined at line 11"><span class="token sort_OpId">A</span></a><span class="operator">(),</span> <span class="operator">([],</span> <a href="#Zero_315_319" id="Zero_162_166" title="Defined at line 17"><span class="token sort_OpId">Zero</span></a><span class="operator">(),</span> <span class="operator">[]))</span>

<span class="keyword">signature</span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#State_225_230" id="State_195_200" title="Referenced at line 11, 12, 13, 14, 29"><span class="token sort_OpId">State</span></a></span> <span class="keyword">constructors</span>
    <a href="#A_152_153" id="A_218_219" title="Referenced at line 6, 31, 34, 38"><span class="token sort_OpId">A</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_195_200" id="State_225_230" title="Defined at line 10"><span class="token sort_OpId">State</span></a></span>
    <a href="#B_566_567" id="B_235_236" title="Referenced at line 32, 37, 40, 41, 44"><span class="token sort_OpId">B</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_195_200" id="State_242_247" title="Defined at line 10"><span class="token sort_OpId">State</span></a></span>
    <a href="#C_664_665" id="C_252_253" title="Referenced at line 35, 43, 46"><span class="token sort_OpId">C</span></a>    <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_195_200" id="State_259_264" title="Defined at line 10"><span class="token sort_OpId">State</span></a></span>
    <a href="#HALT_1058_1062" id="HALT_269_273" title="Referenced at line 47, 49"><span class="token sort_OpId">HALT</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_195_200" id="State_276_281" title="Defined at line 10"><span class="token sort_OpId">State</span></a></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Symbol_322_328" id="Symbol_291_297" title="Referenced at line 17, 18, 25, 25, 25"><span class="token sort_OpId">Symbol</span></a></span> <span class="keyword">constructors</span>
    <a href="#Zero_162_166" id="Zero_315_319" title="Referenced at line 6, 31, 37, 43, 57, 61"><span class="token sort_OpId">Zero</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_291_297" id="Symbol_322_328" title="Defined at line 16"><span class="token sort_OpId">Symbol</span></a></span>
    <a href="#One_583_586" id="One_333_336" title="Referenced at line 32, 34, 35, 38, 40, 41, 44, 46, 47"><span class="token sort_OpId">One</span></a>  <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Symbol_291_297" id="Symbol_340_346" title="Defined at line 16"><span class="token sort_OpId">Symbol</span></a></span>

  <span class="keyword">sorts</span> <span class="cons_SortDecl"><a href="#Move_382_386" id="Move_356_360" title="Referenced at line 21, 22, 23, 53"><span class="token sort_OpId">Move</span></a></span> <span class="keyword">constructors</span>
    <a href="#R_598_599" id="R_378_379" title="Referenced at line 32, 47, 55, 57"><span class="token sort_OpId">R</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_356_360" id="Move_382_386" title="Defined at line 20"><span class="token sort_OpId">Move</span></a></span>
    <a href="#L_696_697" id="L_391_392" title="Referenced at line 35, 38, 41, 44, 59, 61"><span class="token sort_OpId">L</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_356_360" id="Move_395_399" title="Defined at line 20"><span class="token sort_OpId">Move</span></a></span>
    <a href="#N_1421_1422" id="N_404_405" title="Referenced at line 63"><span class="token sort_OpId">N</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Move_356_360" id="Move_408_412" title="Defined at line 20"><span class="token sort_OpId">Move</span></a></span>

  <span class="keyword">sorts</span> <a href="#Tape_501_505" id="Tape_422_426" title="Referenced at line 29, 53, 53"><span class="token sort_OpId">Tape</span></a> <span class="operator">=</span> <span class="operator">(</span><span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_291_297" id="Symbol_435_441" title="Defined at line 16"><span class="token sort_OpId">Symbol</span></a></span><span class="operator">)</span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Symbol_291_297" id="Symbol_445_451" title="Defined at line 16"><span class="token sort_OpId">Symbol</span></a></span> <span class="operator">*</span> <span class="keyword">list</span><span class="operator">(</span><span class="cons_SimpleSort"><a href="#Symbol_291_297" id="Symbol_459_465" title="Defined at line 16"><span class="token sort_OpId">Symbol</span></a></span><span class="operator">))</span>
  
<span class="keyword">rules</span>

  <a href="#busybeaver_141_151" id="busybeaver_480_490" title="Referenced at line 6, 31, 32, 34, 35, 37, 38, 40, 41, 43, 44, 46, 47, 49"><span class="token sort_ConstraintId">busybeaver</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#State_195_200" id="State_493_498" title="Defined at line 10"><span class="token sort_OpId">State</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Tape_422_426" id="Tape_501_505" title="Defined at line 25"><span class="token sort_OpId">Tape</span></a></span>

  <a href="#busybeaver_480_490" id="busybeaver_509_519" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#A_218_219" id="A_520_521" title="Defined at line 11"><span class="token sort_OpId">A</span></a><span class="operator">(),</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_577_581" id="left_526_530" title="Referenced at line 32"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#Zero_315_319" id="Zero_532_536" title="Defined at line 17"><span class="token sort_OpId">Zero</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_590_595" id="right_540_545" title="Referenced at line 32"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_480_490" id="busybeaver_555_565" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#B_235_236" id="B_566_567" title="Defined at line 12"><span class="token sort_OpId">B</span></a><span class="operator">(),</span> <a href="#move_1151_1155" id="move_571_575" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_526_530" id="left_577_581" title="Defined at line 31"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_583_586" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_540_545" id="right_590_595" title="Defined at line 31"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">),</span> <a href="#R_378_379" id="R_598_599" title="Defined at line 21"><span class="token sort_OpId">R</span></a><span class="operator">())).</span>

  <a href="#busybeaver_480_490" id="busybeaver_608_618" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#A_218_219" id="A_619_620" title="Defined at line 11"><span class="token sort_OpId">A</span></a><span class="operator">(),</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_675_679" id="left_625_629" title="Referenced at line 35"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_631_634" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_688_693" id="right_638_643" title="Referenced at line 35"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_480_490" id="busybeaver_653_663" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#C_252_253" id="C_664_665" title="Defined at line 13"><span class="token sort_OpId">C</span></a><span class="operator">(),</span> <a href="#move_1151_1155" id="move_669_673" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_625_629" id="left_675_679" title="Defined at line 34"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_681_684" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_638_643" id="right_688_693" title="Defined at line 34"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">),</span> <a href="#L_391_392" id="L_696_697" title="Defined at line 22"><span class="token sort_OpId">L</span></a><span class="operator">())).</span>

  <a href="#busybeaver_480_490" id="busybeaver_706_716" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#B_235_236" id="B_717_718" title="Defined at line 12"><span class="token sort_OpId">B</span></a><span class="operator">(),</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_774_778" id="left_723_727" title="Referenced at line 38"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#Zero_315_319" id="Zero_729_733" title="Defined at line 17"><span class="token sort_OpId">Zero</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_787_792" id="right_737_742" title="Referenced at line 38"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_480_490" id="busybeaver_752_762" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#A_218_219" id="A_763_764" title="Defined at line 11"><span class="token sort_OpId">A</span></a><span class="operator">(),</span> <a href="#move_1151_1155" id="move_768_772" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_723_727" id="left_774_778" title="Defined at line 37"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_780_783" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_737_742" id="right_787_792" title="Defined at line 37"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">),</span> <a href="#L_391_392" id="L_795_796" title="Defined at line 22"><span class="token sort_OpId">L</span></a><span class="operator">())).</span>

  <a href="#busybeaver_480_490" id="busybeaver_805_815" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#B_235_236" id="B_816_817" title="Defined at line 12"><span class="token sort_OpId">B</span></a><span class="operator">(),</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_872_876" id="left_822_826" title="Referenced at line 41"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_828_831" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_885_890" id="right_835_840" title="Referenced at line 41"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_480_490" id="busybeaver_850_860" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#B_235_236" id="B_861_862" title="Defined at line 12"><span class="token sort_OpId">B</span></a><span class="operator">(),</span> <a href="#move_1151_1155" id="move_866_870" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_822_826" id="left_872_876" title="Defined at line 40"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_878_881" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_835_840" id="right_885_890" title="Defined at line 40"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">),</span> <a href="#L_391_392" id="L_893_894" title="Defined at line 22"><span class="token sort_OpId">L</span></a><span class="operator">())).</span>

  <a href="#busybeaver_480_490" id="busybeaver_903_913" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#C_252_253" id="C_914_915" title="Defined at line 13"><span class="token sort_OpId">C</span></a><span class="operator">(),</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_971_975" id="left_920_924" title="Referenced at line 44"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#Zero_315_319" id="Zero_926_930" title="Defined at line 17"><span class="token sort_OpId">Zero</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_984_989" id="right_934_939" title="Referenced at line 44"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_480_490" id="busybeaver_949_959" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#B_235_236" id="B_960_961" title="Defined at line 12"><span class="token sort_OpId">B</span></a><span class="operator">(),</span> <a href="#move_1151_1155" id="move_965_969" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_920_924" id="left_971_975" title="Defined at line 43"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_977_980" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_934_939" id="right_984_989" title="Defined at line 43"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">),</span> <a href="#L_391_392" id="L_992_993" title="Defined at line 22"><span class="token sort_OpId">L</span></a><span class="operator">())).</span>

  <a href="#busybeaver_480_490" id="busybeaver_1002_1012" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#C_252_253" id="C_1013_1014" title="Defined at line 13"><span class="token sort_OpId">C</span></a><span class="operator">(),</span> <span class="operator">(</span><span class="cons_Var"><a href="#left_1072_1076" id="left_1019_1023" title="Referenced at line 47"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_1025_1028" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_1085_1090" id="right_1032_1037" title="Referenced at line 47"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">))</span> <span class="operator">:-</span>
    <a href="#busybeaver_480_490" id="busybeaver_1047_1057" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#HALT_269_273" id="HALT_1058_1062" title="Defined at line 14"><span class="token sort_OpId">HALT</span></a><span class="operator">(),</span> <a href="#move_1151_1155" id="move_1066_1070" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var"><a href="#left_1019_1023" id="left_1072_1076" title="Defined at line 46"><span class="token sort_ConstraintId">left</span></a></span><span class="operator">,</span> <a href="#One_333_336" id="One_1078_1081" title="Defined at line 18"><span class="token sort_OpId">One</span></a><span class="operator">(),</span> <span class="cons_Var"><a href="#right_1032_1037" id="right_1085_1090" title="Defined at line 46"><span class="token sort_ConstraintId">right</span></a></span><span class="operator">),</span> <a href="#R_378_379" id="R_1093_1094" title="Defined at line 21"><span class="token sort_OpId">R</span></a><span class="operator">())).</span>

  <a href="#busybeaver_480_490" id="busybeaver_1103_1113" title="Defined at line 29"><span class="token sort_ConstraintId">busybeaver</span></a><span class="operator">(</span><a href="#HALT_269_273" id="HALT_1114_1118" title="Defined at line 14"><span class="token sort_OpId">HALT</span></a><span class="operator">(),</span> <span class="operator">(</span><span class="cons_Var"><span id="left_1123_1127" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="s_1129_1130" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">,</span> <span class="cons_Var"><span id="right_1132_1137" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span><span class="operator">)).</span>

<span class="keyword">rules</span>

  <a href="#move_571_575" id="move_1151_1155" title="Referenced at line 32, 35, 38, 41, 44, 47, 55, 57, 59, 61, 63"><span class="token sort_ConstraintId">move</span></a> <span class="operator">:</span> <span class="cons_SimpleSort"><a href="#Tape_422_426" id="Tape_1158_1162" title="Defined at line 25"><span class="token sort_OpId">Tape</span></a></span> <span class="operator">*</span> <span class="cons_SimpleSort"><a href="#Move_356_360" id="Move_1165_1169" title="Defined at line 20"><span class="token sort_OpId">Move</span></a></span> <span class="operator">-&gt;</span> <span class="cons_SimpleSort"><a href="#Tape_422_426" id="Tape_1173_1177" title="Defined at line 25"><span class="token sort_OpId">Tape</span></a></span>

  <a href="#move_1151_1155" id="move_1181_1185" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var">left</span><span class="operator">,</span> <span class="cons_Var"><span id="s_1193_1194" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var"><span id="s'_1197_1199" title="Not referenced locally, nor via imports">s<span class="operator">'</span></span></span><span class="operator">|</span><span class="cons_Var"><span id="right_1200_1205" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span><span class="operator">]),</span> <a href="#R_378_379" id="R_1209_1210" title="Defined at line 21"><span class="token sort_OpId">R</span></a><span class="operator">())</span> <span class="operator">=</span> <span class="operator">([</span><span class="cons_Var">s</span><span class="operator">|</span><span class="cons_Var"><span id="left_1220_1224" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span><span class="operator">],</span> <span class="cons_Var">s'</span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">).</span>

  <a href="#move_1151_1155" id="move_1242_1246" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">((</span><span class="cons_Var">left</span><span class="operator">,</span> <span class="cons_Var"><span id="s_1254_1255" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">,</span> <span class="operator">[]),</span> <a href="#R_378_379" id="R_1262_1263" title="Defined at line 21"><span class="token sort_OpId">R</span></a><span class="operator">())</span> <span class="operator">=</span> <span class="operator">([</span><span class="cons_Var">s</span><span class="operator">|</span><span class="cons_Var"><span id="left_1273_1277" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span><span class="operator">],</span> <a href="#Zero_315_319" id="Zero_1280_1284" title="Defined at line 17"><span class="token sort_OpId">Zero</span></a><span class="operator">(),</span> <span class="operator">[]).</span>

  <a href="#move_1151_1155" id="move_1296_1300" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">(([</span><span class="cons_Var">s'</span><span class="operator">|</span><span class="cons_Var"><span id="left_1306_1310" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span><span class="operator">],</span> <span class="cons_Var"><span id="s_1313_1314" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">,</span> <span class="cons_Var">right</span><span class="operator">),</span> <a href="#L_391_392" id="L_1324_1325" title="Defined at line 22"><span class="token sort_OpId">L</span></a><span class="operator">())</span> <span class="operator">=</span> <span class="operator">(</span><span class="cons_Var">left</span><span class="operator">,</span> <span class="cons_Var"><span id="s'_1338_1340" title="Not referenced locally, nor via imports">s<span class="operator">'</span></span></span><span class="operator">,</span> <span class="operator">[</span><span class="cons_Var">s</span><span class="operator">|</span><span class="cons_Var"><span id="right_1345_1350" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span><span class="operator">]).</span>

  <a href="#move_1151_1155" id="move_1357_1361" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">(([],</span> <span class="cons_Var">s</span><span class="operator">,</span> <span class="cons_Var"><span id="right_1370_1375" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span><span class="operator">),</span> <a href="#L_391_392" id="L_1378_1379" title="Defined at line 22"><span class="token sort_OpId">L</span></a><span class="operator">())</span> <span class="operator">=</span> <span class="operator">([],</span> <a href="#Zero_315_319" id="Zero_1390_1394" title="Defined at line 17"><span class="token sort_OpId">Zero</span></a><span class="operator">(),</span> <span class="operator">[</span><span class="cons_Var"><span id="s_1399_1400" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span><span class="operator">|</span><span class="cons_Var">right</span><span class="operator">]).</span>

  <a href="#move_1151_1155" id="move_1413_1417" title="Defined at line 53"><span class="token sort_ConstraintId">move</span></a><span class="operator">(</span><span class="cons_Var"><span id="T_1418_1419" title="Not referenced locally, nor via imports"><span class="token sort_OpId">T</span></span></span><span class="operator">,</span> <a href="#N_404_405" id="N_1421_1422" title="Defined at line 23"><span class="token sort_OpId">N</span></a><span class="operator">())</span> <span class="operator">=</span> <span class="cons_Var">T</span><span class="operator">.</span>

</code></pre></td></tr></tbody></table></div>