---
title: bb-rules.stx
hide:
  - toc
---

# `bb-rules.stx`

:simple-github: [pdmosses/nabl/statix.example/src/busybeaver/bb-rules.stx]

[pdmosses/nabl/statix.example/src/busybeaver/bb-rules.stx]: https://github.com/pdmosses/nabl/blob/master/statix.example/src/busybeaver/bb-rules.stx "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="token layout">// 3-state Busy Beaver Turing machine specification</span>
<span class="token layout">// https://en.wikipedia.org/wiki/Turing_machine_examples#3-state_Busy_Beaver</span>

<span class="token keyword">module</span> <a href="../bb-test.stxtest#busybeaver/bb-rules_207_226" id="busybeaver/bb-rules_137_156" title="Referenced at ../bb-test.stxtest line 11"><span class="token sort_ConstraintId">busybeaver</span>/<span class="token sort_ConstraintId">bb</span>-<span class="token keyword">rules</span></a>

<span class="token keyword">imports</span>

  <a href="../bb-sig.stx#busybeaver/bb-sig_137_154" id="busybeaver/bb-sig_169_186" title="Defined at ../bb-sig.stx line 4"><span class="token sort_ConstraintId">busybeaver</span>/<span class="token sort_ConstraintId">bb</span>-<span class="token sort_ConstraintId">sig</span></a>

<span class="token keyword">rules</span>

  <a href="#busybeaver_226_236" id="busybeaver_197_207" title="Referenced at line 14, 15, 17, 18, 20, 21, 23, 24, 26, 27, 29, 30, 32; ../bb-test.stxtest line 6"><span class="token sort_ConstraintId">busybeaver</span></a> : <span class="cons_SimpleSort"><a href="../bb-sig.stx#State_175_180" id="State_210_215" title="Defined at ../bb-sig.stx line 8"><span class="token sort_OpId">State</span></a></span> * <span class="cons_SimpleSort"><a href="../bb-sig.stx#Tape_402_406" id="Tape_218_222" title="Defined at ../bb-sig.stx line 23"><span class="token sort_OpId">Tape</span></a></span>

  <a href="#busybeaver_197_207" id="busybeaver_226_236" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#A_198_199" id="A_237_238" title="Defined at ../bb-sig.stx line 9"><span class="token sort_OpId">A</span></a>(), (<span class="cons_Var"><a href="#left_294_298" id="left_243_247" title="Referenced at line 15"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#Zero_295_299" id="Zero_249_253" title="Defined at ../bb-sig.stx line 15"><span class="token sort_OpId">Zero</span></a>(), <span class="cons_Var"><a href="#right_307_312" id="right_257_262" title="Referenced at line 15"><span class="token sort_ConstraintId">right</span></a></span>)) :-
    <a href="#busybeaver_197_207" id="busybeaver_272_282" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#B_215_216" id="B_283_284" title="Defined at ../bb-sig.stx line 10"><span class="token sort_OpId">B</span></a>(), <a href="#move_868_872" id="move_288_292" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var"><a href="#left_243_247" id="left_294_298" title="Defined at line 14"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_300_303" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_257_262" id="right_307_312" title="Defined at line 14"><span class="token sort_ConstraintId">right</span></a></span>), <a href="../bb-sig.stx#R_358_359" id="R_315_316" title="Defined at ../bb-sig.stx line 19"><span class="token sort_OpId">R</span></a>())).

  <a href="#busybeaver_197_207" id="busybeaver_325_335" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#A_198_199" id="A_336_337" title="Defined at ../bb-sig.stx line 9"><span class="token sort_OpId">A</span></a>(), (<span class="cons_Var"><a href="#left_392_396" id="left_342_346" title="Referenced at line 18"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_348_351" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_405_410" id="right_355_360" title="Referenced at line 18"><span class="token sort_ConstraintId">right</span></a></span>)) :-
    <a href="#busybeaver_197_207" id="busybeaver_370_380" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#C_232_233" id="C_381_382" title="Defined at ../bb-sig.stx line 11"><span class="token sort_OpId">C</span></a>(), <a href="#move_868_872" id="move_386_390" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var"><a href="#left_342_346" id="left_392_396" title="Defined at line 17"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_398_401" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_355_360" id="right_405_410" title="Defined at line 17"><span class="token sort_ConstraintId">right</span></a></span>), <a href="../bb-sig.stx#L_371_372" id="L_413_414" title="Defined at ../bb-sig.stx line 20"><span class="token sort_OpId">L</span></a>())).

  <a href="#busybeaver_197_207" id="busybeaver_423_433" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#B_215_216" id="B_434_435" title="Defined at ../bb-sig.stx line 10"><span class="token sort_OpId">B</span></a>(), (<span class="cons_Var"><a href="#left_491_495" id="left_440_444" title="Referenced at line 21"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#Zero_295_299" id="Zero_446_450" title="Defined at ../bb-sig.stx line 15"><span class="token sort_OpId">Zero</span></a>(), <span class="cons_Var"><a href="#right_504_509" id="right_454_459" title="Referenced at line 21"><span class="token sort_ConstraintId">right</span></a></span>)) :-
    <a href="#busybeaver_197_207" id="busybeaver_469_479" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#A_198_199" id="A_480_481" title="Defined at ../bb-sig.stx line 9"><span class="token sort_OpId">A</span></a>(), <a href="#move_868_872" id="move_485_489" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var"><a href="#left_440_444" id="left_491_495" title="Defined at line 20"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_497_500" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_454_459" id="right_504_509" title="Defined at line 20"><span class="token sort_ConstraintId">right</span></a></span>), <a href="../bb-sig.stx#L_371_372" id="L_512_513" title="Defined at ../bb-sig.stx line 20"><span class="token sort_OpId">L</span></a>())).

  <a href="#busybeaver_197_207" id="busybeaver_522_532" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#B_215_216" id="B_533_534" title="Defined at ../bb-sig.stx line 10"><span class="token sort_OpId">B</span></a>(), (<span class="cons_Var"><a href="#left_589_593" id="left_539_543" title="Referenced at line 24"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_545_548" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_602_607" id="right_552_557" title="Referenced at line 24"><span class="token sort_ConstraintId">right</span></a></span>)) :-
    <a href="#busybeaver_197_207" id="busybeaver_567_577" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#B_215_216" id="B_578_579" title="Defined at ../bb-sig.stx line 10"><span class="token sort_OpId">B</span></a>(), <a href="#move_868_872" id="move_583_587" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var"><a href="#left_539_543" id="left_589_593" title="Defined at line 23"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_595_598" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_552_557" id="right_602_607" title="Defined at line 23"><span class="token sort_ConstraintId">right</span></a></span>), <a href="../bb-sig.stx#L_371_372" id="L_610_611" title="Defined at ../bb-sig.stx line 20"><span class="token sort_OpId">L</span></a>())).

  <a href="#busybeaver_197_207" id="busybeaver_620_630" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#C_232_233" id="C_631_632" title="Defined at ../bb-sig.stx line 11"><span class="token sort_OpId">C</span></a>(), (<span class="cons_Var"><a href="#left_688_692" id="left_637_641" title="Referenced at line 27"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#Zero_295_299" id="Zero_643_647" title="Defined at ../bb-sig.stx line 15"><span class="token sort_OpId">Zero</span></a>(), <span class="cons_Var"><a href="#right_701_706" id="right_651_656" title="Referenced at line 27"><span class="token sort_ConstraintId">right</span></a></span>)) :-
    <a href="#busybeaver_197_207" id="busybeaver_666_676" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#B_215_216" id="B_677_678" title="Defined at ../bb-sig.stx line 10"><span class="token sort_OpId">B</span></a>(), <a href="#move_868_872" id="move_682_686" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var"><a href="#left_637_641" id="left_688_692" title="Defined at line 26"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_694_697" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_651_656" id="right_701_706" title="Defined at line 26"><span class="token sort_ConstraintId">right</span></a></span>), <a href="../bb-sig.stx#L_371_372" id="L_709_710" title="Defined at ../bb-sig.stx line 20"><span class="token sort_OpId">L</span></a>())).

  <a href="#busybeaver_197_207" id="busybeaver_719_729" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#C_232_233" id="C_730_731" title="Defined at ../bb-sig.stx line 11"><span class="token sort_OpId">C</span></a>(), (<span class="cons_Var"><a href="#left_789_793" id="left_736_740" title="Referenced at line 30"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_742_745" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_802_807" id="right_749_754" title="Referenced at line 30"><span class="token sort_ConstraintId">right</span></a></span>)) :-
    <a href="#busybeaver_197_207" id="busybeaver_764_774" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#HALT_249_253" id="HALT_775_779" title="Defined at ../bb-sig.stx line 12"><span class="token sort_OpId">HALT</span></a>(), <a href="#move_868_872" id="move_783_787" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var"><a href="#left_736_740" id="left_789_793" title="Defined at line 29"><span class="token sort_ConstraintId">left</span></a></span>, <a href="../bb-sig.stx#One_313_316" id="One_795_798" title="Defined at ../bb-sig.stx line 16"><span class="token sort_OpId">One</span></a>(), <span class="cons_Var"><a href="#right_749_754" id="right_802_807" title="Defined at line 29"><span class="token sort_ConstraintId">right</span></a></span>), <a href="../bb-sig.stx#R_358_359" id="R_810_811" title="Defined at ../bb-sig.stx line 19"><span class="token sort_OpId">R</span></a>())).

  <a href="#busybeaver_197_207" id="busybeaver_820_830" title="Defined at line 12"><span class="token sort_ConstraintId">busybeaver</span></a>(<a href="../bb-sig.stx#HALT_249_253" id="HALT_831_835" title="Defined at ../bb-sig.stx line 12"><span class="token sort_OpId">HALT</span></a>(), (<span class="cons_Var"><span id="left_840_844" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span>, <span class="cons_Var"><span id="s_846_847" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <span class="cons_Var"><span id="right_849_854" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span>)).

<span class="token keyword">rules</span>

  <a href="#move_288_292" id="move_868_872" title="Referenced at line 15, 18, 21, 24, 27, 30, 38, 40, 42, 44, 46"><span class="token sort_ConstraintId">move</span></a> : <span class="cons_SimpleSort"><a href="../bb-sig.stx#Tape_402_406" id="Tape_875_879" title="Defined at ../bb-sig.stx line 23"><span class="token sort_OpId">Tape</span></a></span> * <span class="cons_SimpleSort"><a href="../bb-sig.stx#Move_336_340" id="Move_882_886" title="Defined at ../bb-sig.stx line 18"><span class="token sort_OpId">Move</span></a></span> -&gt; <span class="cons_SimpleSort"><a href="../bb-sig.stx#Tape_402_406" id="Tape_890_894" title="Defined at ../bb-sig.stx line 23"><span class="token sort_OpId">Tape</span></a></span>

  <a href="#move_868_872" id="move_898_902" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var"><span id="left_904_908" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span>, <span class="cons_Var">s</span>, [<span class="cons_Var"><span id="s'_914_916" title="Not referenced locally, nor via imports">s'</span></span>|<span class="cons_Var"><span id="right_917_922" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span>]), <a href="../bb-sig.stx#R_358_359" id="R_926_927" title="Defined at ../bb-sig.stx line 19"><span class="token sort_OpId">R</span></a>()) = ([<span class="cons_Var"><span id="s_935_936" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>|<span class="cons_Var">left</span>], <span class="cons_Var">s'</span>, <span class="cons_Var">right</span>).

  <a href="#move_868_872" id="move_959_963" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>((<span class="cons_Var">left</span>, <span class="cons_Var">s</span>, []), <a href="../bb-sig.stx#R_358_359" id="R_979_980" title="Defined at ../bb-sig.stx line 19"><span class="token sort_OpId">R</span></a>()) = ([<span class="cons_Var"><span id="s_988_989" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>|<span class="cons_Var"><span id="left_990_994" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span>], <a href="../bb-sig.stx#Zero_295_299" id="Zero_997_1001" title="Defined at ../bb-sig.stx line 15"><span class="token sort_OpId">Zero</span></a>(), []).

  <a href="#move_868_872" id="move_1013_1017" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>(([<span class="cons_Var">s'</span>|<span class="cons_Var">left</span>], <span class="cons_Var">s</span>, <span class="cons_Var"><span id="right_1033_1038" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span>), <a href="../bb-sig.stx#L_371_372" id="L_1041_1042" title="Defined at ../bb-sig.stx line 20"><span class="token sort_OpId">L</span></a>()) = (<span class="cons_Var"><span id="left_1049_1053" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">left</span></span></span>, <span class="cons_Var"><span id="s'_1055_1057" title="Not referenced locally, nor via imports">s'</span></span>, [<span class="cons_Var"><span id="s_1060_1061" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>|<span class="cons_Var">right</span>]).

  <a href="#move_868_872" id="move_1074_1078" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>(([], <span class="cons_Var"><span id="s_1084_1085" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">s</span></span></span>, <span class="cons_Var">right</span>), <a href="../bb-sig.stx#L_371_372" id="L_1095_1096" title="Defined at ../bb-sig.stx line 20"><span class="token sort_OpId">L</span></a>()) = ([], <a href="../bb-sig.stx#Zero_295_299" id="Zero_1107_1111" title="Defined at ../bb-sig.stx line 15"><span class="token sort_OpId">Zero</span></a>(), [<span class="cons_Var">s</span>|<span class="cons_Var"><span id="right_1118_1123" title="Not referenced locally, nor via imports"><span class="token sort_ConstraintId">right</span></span></span>]).

  <a href="#move_868_872" id="move_1130_1134" title="Defined at line 36"><span class="token sort_ConstraintId">move</span></a>(<span class="cons_Var">T</span>, <a href="../bb-sig.stx#N_384_385" id="N_1138_1139" title="Defined at ../bb-sig.stx line 21"><span class="token sort_OpId">N</span></a>()) = <span class="cons_Var"><span id="T_1145_1146" title="Not referenced locally, nor via imports"><span class="token sort_OpId">T</span></span></span>.

</code></pre></td></tr></tbody></table></div>