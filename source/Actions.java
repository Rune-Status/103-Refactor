import java.util.Date;

public final class Actions {
      
      static void execute(ScriptEvent event, int maxOperations) {
            Object[] args = event.args;
            int id = ((Integer) args[0]).intValue();
            RuneScript script = Class39.getRuneScript(id);
            if (script != null) {
              int var5 = 0;
              int var6 = 0;
              int var7 = -1;
              int[] opcodes = script.opcodes;
              int[] intOperands = script.intOperands;
              Class3.anInt87 = 0;

              int index;
              try {
                Class3.intArgs = new int[script.intArgCount];
                int e = 0;
                Class3.stringArgs = new String[script.stringArgCount];
                int var47 = 0;

                int iArg;
                String sArg;
                for (index = 1; index < args.length; index++) {
                  if (args[index] instanceof Integer) {
                    iArg = ((Integer) args[index]).intValue();
                    if (iArg == -2147483647) {
                      iArg = event.anInt1438;
                    }

                    if (iArg == -2147483646) {
                      iArg = event.anInt1431;
                    }

                    if (iArg == -2147483645) {
                      iArg = event.widget != null ? event.widget.hash : -1;
                    }

                    if (iArg == -2147483644) {
                      iArg = event.anInt1429;
                    }

                    if (iArg == -2147483643) {
                      iArg = event.widget != null ? event.widget.index : -1;
                    }

                    if (iArg == -2147483642) {
                      iArg = event.aWidget1433 != null ? event.aWidget1433.hash : -1;
                    }

                    if (iArg == -2147483641) {
                      iArg = event.aWidget1433 != null ? event.aWidget1433.index : -1;
                    }

                    if (iArg == -2147483640) {
                      iArg = event.anInt1434;
                    }

                    if (iArg == -2147483639) {
                      iArg = event.anInt1435;
                    }

                    Class3.intArgs[e++] = iArg;
                  } else if (args[index] instanceof String) {
                    sArg = (String) args[index];
                    if (sArg.equals("event_opbase")) {
                      sArg = event.opbase;
                    }

                    Class3.stringArgs[var47++] = sArg;
                  }
                }

                index = 0;
                Class3.anInt91 = event.anInt1436;

                label3072: while (true) {
                  ++index;
                  if (index > maxOperations) {
                    throw new RuntimeException();
                  }

                  ++var7;
                  int opcode = opcodes[var7];
                  int var16;
                  int var33;
                  int var45;
                  String[] var73;
                  String var83;
                  int[] var89;
                  if (opcode < 100) {
                    if (opcode == 0) {
                      Class3.intStack[var5++] = intOperands[var7];
                      continue;
                    }

                    if (opcode == 1) {
                      iArg = intOperands[var7];
                      Class3.intStack[var5++] = Class94.tempVars[iArg];
                      continue;
                    }

                    if (opcode == 2) {
                      iArg = intOperands[var7];
                      --var5;
                      Class94.tempVars[iArg] = Class3.intStack[var5];
                      World.method484(iArg);
                      continue;
                    }

                    if (opcode == 3) {
                      Class3.stringStack[var6++] = script.stringOperands[var7];
                      continue;
                    }

                    if (opcode == 6) {
                      var7 += intOperands[var7];
                      continue;
                    }

                    if (opcode == 7) {
                      var5 -= 2;
                      if (Class3.intStack[var5 + 1] != Class3.intStack[var5]) {
                        var7 += intOperands[var7];
                      }
                      continue;
                    }

                    if (opcode == 8) {
                      var5 -= 2;
                      if (Class3.intStack[var5 + 1] == Class3.intStack[var5]) {
                        var7 += intOperands[var7];
                      }
                      continue;
                    }

                    if (opcode == 9) {
                      var5 -= 2;
                      if (Class3.intStack[var5] < Class3.intStack[var5 + 1]) {
                        var7 += intOperands[var7];
                      }
                      continue;
                    }

                    if (opcode == 10) {
                      var5 -= 2;
                      if (Class3.intStack[var5] > Class3.intStack[var5 + 1]) {
                        var7 += intOperands[var7];
                      }
                      continue;
                    }

                    if (opcode == 21) {
                      if (Class3.anInt87 == 0) {
                        return;
                      }

                      Class33 var501 = Class3.aClass33Array86[--Class3.anInt87];
                      script = var501.aRuneScript361;
                      opcodes = script.opcodes;
                      intOperands = script.intOperands;
                      var7 = var501.anInt363;
                      Class3.intArgs = var501.anIntArray362;
                      Class3.stringArgs = var501.aStringArray360;
                      continue;
                    }

                    if (opcode == 25) {
                      iArg = intOperands[var7];
                      Class3.intStack[var5++] = Class91.method401(iArg);
                      continue;
                    }

                    if (opcode == 27) {
                      iArg = intOperands[var7];
                      --var5;
                      Class75.method336(iArg, Class3.intStack[var5]);
                      continue;
                    }

                    if (opcode == 31) {
                      var5 -= 2;
                      if (Class3.intStack[var5] <= Class3.intStack[var5 + 1]) {
                        var7 += intOperands[var7];
                      }
                      continue;
                    }

                    if (opcode == 32) {
                      var5 -= 2;
                      if (Class3.intStack[var5] >= Class3.intStack[var5 + 1]) {
                        var7 += intOperands[var7];
                      }
                      continue;
                    }

                    if (opcode == 33) {
                      Class3.intStack[var5++] = Class3.intArgs[intOperands[var7]];
                      continue;
                    }

                    int var491;
                    if (opcode == 34) {
                      var491 = intOperands[var7];
                      --var5;
                      Class3.intArgs[var491] = Class3.intStack[var5];
                      continue;
                    }

                    if (opcode == 35) {
                      Class3.stringStack[var6++] = Class3.stringArgs[intOperands[var7]];
                      continue;
                    }

                    if (opcode == 36) {
                      var491 = intOperands[var7];
                      --var6;
                      Class3.stringArgs[var491] = Class3.stringStack[var6];
                      continue;
                    }

                    if (opcode == 37) {
                      iArg = intOperands[var7];
                      var6 -= iArg;
                      var83 = LandscapeTile.method580(Class3.stringStack, var6, iArg);
                      Class3.stringStack[var6++] = var83;
                      continue;
                    }

                    if (opcode == 38) {
                      --var5;
                      continue;
                    }

                    if (opcode == 39) {
                      --var6;
                      continue;
                    }

                    if (opcode == 40) {
                      iArg = intOperands[var7];
                      RuneScript var94 = Class39.getRuneScript(iArg);
                      var89 = new int[var94.intArgCount];
                      var73 = new String[var94.stringArgCount];

                      for (var45 = 0; var45 < var94.intStackCount; var45++) {
                        var89[var45] = Class3.intStack[var5 - var94.intStackCount + var45];
                      }

                      for (var45 = 0; var45 < var94.stringStackCount; var45++) {
                        var73[var45] = Class3.stringStack[var6 - var94.stringStackCount + var45];
                      }

                      var5 -= var94.intStackCount;
                      var6 -= var94.stringStackCount;
                      Class33 var481 = new Class33();
                      var481.aRuneScript361 = script;
                      var481.anInt363 = var7;
                      var481.anIntArray362 = Class3.intArgs;
                      var481.aStringArray360 = Class3.stringArgs;
                      Class3.aClass33Array86[++Class3.anInt87 - 1] = var481;
                      script = var94;
                      opcodes = var94.opcodes;
                      intOperands = var94.intOperands;
                      var7 = -1;
                      Class3.intArgs = var89;
                      Class3.stringArgs = var73;
                      continue;
                    }

                    if (opcode == 42) {
                      Class3.intStack[var5++] = Class33.aClass28_364.getVarc(intOperands[var7]);
                      continue;
                    }

                    if (opcode == 43) {
                      var491 = intOperands[var7];
                      --var5;
                      Class33.aClass28_364.putVarc(var491, Class3.intStack[var5]);
                      continue;
                    }

                    if (opcode == 44) {
                      iArg = intOperands[var7] >> 16;
                      var33 = intOperands[var7] & 0xffff;
                      --var5;
                      var16 = Class3.intStack[var5];
                      if (var16 >= 0 && var16 <= 5000) {
                        Class3.anIntArray81[iArg] = var16;
                        byte var91 = -1;
                        if (var33 == 105) {
                          var91 = 0;
                        }

                        var45 = 0;

                        while (true) {
                          if (var45 >= var16) {
                            continue label3072;
                          }

                          Class3.anIntArrayArray84[iArg][var45] = var91;
                          ++var45;
                        }
                      }

                      throw new RuntimeException();
                    }

                    if (opcode == 45) {
                      iArg = intOperands[var7];
                      --var5;
                      var33 = Class3.intStack[var5];
                      if (var33 >= 0 && var33 < Class3.anIntArray81[iArg]) {
                        Class3.intStack[var5++] = Class3.anIntArrayArray84[iArg][var33];
                        continue;
                      }

                      throw new RuntimeException();
                    }

                    if (opcode == 46) {
                      iArg = intOperands[var7];
                      var5 -= 2;
                      var33 = Class3.intStack[var5];
                      if (var33 >= 0 && var33 < Class3.anIntArray81[iArg]) {
                        Class3.anIntArrayArray84[iArg][var33] = Class3.intStack[var5 + 1];
                        continue;
                      }

                      throw new RuntimeException();
                    }

                    if (opcode == 47) {
                      sArg = Class33.aClass28_364.getVarcString(intOperands[var7]);
                      if (sArg == null) {
                        sArg = "null";
                      }

                      Class3.stringStack[var6++] = sArg;
                      continue;
                    }

                    if (opcode == 48) {
                      var491 = intOperands[var7];
                      --var6;
                      Class33.aClass28_364.putVarcString(var491, Class3.stringStack[var6]);
                      continue;
                    }
                  }

                  boolean var46;
                  if (intOperands[var7] == 1) {
                    var46 = true;
                  } else {
                    var46 = false;
                  }

                  Widget var15;
                  Widget var17;
                  Widget var18;
                  int var20;
                  Widget var34;
                  int var35;
                  boolean var41;
                  boolean var55;
                  if (opcode < 1000) {
                    if (opcode == 100) {
                      var5 -= 3;
                      var33 = Class3.intStack[var5];
                      var16 = Class3.intStack[var5 + 1];
                      var35 = Class3.intStack[var5 + 2];
                      if (var16 == 0) {
                        throw new RuntimeException();
                      }

                      var18 = Class94.getWidget(var33);
                      if (var18.children == null) {
                        var18.children = new Widget[var35 + 1];
                      }

                      if (var18.children.length <= var35) {
                        Widget[] var551 = new Widget[var35 + 1];

                        for (var20 = 0; var20 < var18.children.length; var20++) {
                          var551[var20] = var18.children[var20];
                        }

                        var18.children = var551;
                      }

                      if (var35 > 0 && var18.children[var35 - 1] == null) {
                        throw new RuntimeException("" + (var35 - 1));
                      }

                      Widget var56 = new Widget();
                      var56.type = var16;
                      var56.parentId = var56.hash = var18.hash;
                      var56.index = var35;
                      var56.interactable = true;
                      var18.children[var35] = var56;
                      if (var46) {
                        ClientSettings.aWidget304 = var56;
                      } else {
                        Class3.aWidget88 = var56;
                      }

                      Class68.method326(var18);
                      continue;
                    }

                    if (opcode == 101) {
                      var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                      var34 = Class94.getWidget(var15.hash);
                      var34.children[var15.index] = null;
                      Class68.method326(var34);
                      continue;
                    }

                    if (opcode == 102) {
                      --var5;
                      var15 = Class94.getWidget(Class3.intStack[var5]);
                      var15.children = null;
                      Class68.method326(var15);
                      continue;
                    }

                    if (opcode == 200) {
                      var5 -= 2;
                      var33 = Class3.intStack[var5];
                      var16 = Class3.intStack[var5 + 1];
                      var17 = AbstractProducer.method146(var33, var16);
                      if (var17 != null && var16 != -1) {
                        Class3.intStack[var5++] = 1;
                        if (var46) {
                          ClientSettings.aWidget304 = var17;
                        } else {
                          Class3.aWidget88 = var17;
                        }
                        continue;
                      }

                      Class3.intStack[var5++] = 0;
                      continue;
                    }

                    if (opcode == 201) {
                      --var5;
                      var15 = Class94.getWidget(Class3.intStack[var5]);
                      if (var15 != null) {
                        Class3.intStack[var5++] = 1;
                        if (var46) {
                          ClientSettings.aWidget304 = var15;
                        } else {
                          Class3.aWidget88 = var15;
                        }
                      } else {
                        Class3.intStack[var5++] = 0;
                      }
                      continue;
                    }
                  } else {
                    boolean var98;
                    if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
                      String var93;
                      if ((opcode < 1100 || opcode >= 1200) && (opcode < 2100 || opcode >= 2200)) {
                        if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
                          if (opcode >= 2000) {
                            opcode -= 1000;
                            --var5;
                            var15 = Class94.getWidget(Class3.intStack[var5]);
                          } else {
                            var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                          }

                          Class68.method326(var15);
                          if (opcode == 1200 || opcode == 1205 || opcode == 1212) {
                            var5 -= 2;
                            var16 = Class3.intStack[var5];
                            var35 = Class3.intStack[var5 + 1];
                            var15.itemId = var16;
                            var15.itemQuantity = var35;
                            ItemType var571 = FriendedPlayer.getItemType(var16);
                            var15.rotationX = var571.anInt1612;
                            var15.rotationZ = var571.anInt1613;
                            var15.rotationY = var571.anInt1634;
                            var15.anInt1198 = var571.anInt1642;
                            var15.anInt1151 = var571.anInt1616;
                            var15.modelZoom = var571.anInt1637;
                            if (opcode == 1205) {
                              var15.anInt1155 = 0;
                            } else if (opcode == 1212 | var571.stackable == 1) {
                              var15.anInt1155 = 1;
                            } else {
                              var15.anInt1155 = 2;
                            }

                            if (var15.anInt1160 > 0) {
                              var15.modelZoom = var15.modelZoom * 32 / var15.anInt1160;
                            } else if (var15.anInt1135 * 124195285 > 0) {
                              var15.modelZoom = var15.modelZoom * 32 / (var15.anInt1135 * 124195285);
                            }
                            continue;
                          }

                          if (opcode == 1201) {
                            var15.modelType = 2;
                            --var5;
                            var15.modelId = Class3.intStack[var5];
                            continue;
                          }

                          if (opcode == 1202) {
                            var15.modelType = 3;
                            var15.modelId = Class68.myPlayer.config.method269();
                            continue;
                          }
                        } else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
                          if (opcode >= 2000) {
                            opcode -= 1000;
                            --var5;
                            var15 = Class94.getWidget(Class3.intStack[var5]);
                          } else {
                            var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                          }

                          if (opcode == 1300) {
                            --var5;
                            var16 = Class3.intStack[var5] - 1;
                            if (var16 >= 0 && var16 <= 9) {
                              --var6;
                              var15.method493(var16, Class3.stringStack[var6]);
                              continue;
                            }

                            --var6;
                            continue;
                          }

                          if (opcode == 1301) {
                            var5 -= 2;
                            var16 = Class3.intStack[var5];
                            var35 = Class3.intStack[var5 + 1];
                            var15.parent = AbstractProducer.method146(var16, var35);
                            continue;
                          }

                          if (opcode == 1302) {
                            --var5;
                            var15.aBool1179 = Class3.intStack[var5] == 1;
                            continue;
                          }

                          if (opcode == 1303) {
                            --var5;
                            var15.anInt1166 = Class3.intStack[var5];
                            continue;
                          }

                          if (opcode == 1304) {
                            --var5;
                            var15.anInt1146 = Class3.intStack[var5];
                            continue;
                          }

                          if (opcode == 1305) {
                            --var6;
                            var15.name = Class3.stringStack[var6];
                            continue;
                          }

                          if (opcode == 1306) {
                            --var6;
                            var15.selectedAction = Class3.stringStack[var6];
                            continue;
                          }

                          if (opcode == 1307) {
                            var15.actions = null;
                            continue;
                          }
                        } else {
                          int[] var38;
                          int var49;
                          String var54;
                          if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
                            if (opcode >= 2000) {
                              opcode -= 1000;
                              --var5;
                              var15 = Class94.getWidget(Class3.intStack[var5]);
                            } else {
                              var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                            }

                            --var6;
                            var54 = Class3.stringStack[var6];
                            var38 = null;
                            if (var54.length() > 0 && var54.charAt(var54.length() - 1) == 89) {
                              --var5;
                              var45 = Class3.intStack[var5];
                              if (var45 > 0) {
                                for (var38 = new int[var45]; var45-- > 0; var38[var45] = Class3.intStack[var5]) {
                                  --var5;
                                }
                              }

                              var54 = var54.substring(0, var54.length() - 1);
                            }

                            Object[] var601 = new Object[var54.length() + 1];

                            for (var49 = var601.length - 1; var49 >= 1; --var49) {
                              if (var54.charAt(var49 - 1) == 115) {
                                --var6;
                                var601[var49] = Class3.stringStack[var6];
                              } else {
                                --var5;
                                Integer var621 = new Integer(Class3.intStack[var5]);
                                var601[var49] = var621;
                              }
                            }

                            --var5;
                            var49 = Class3.intStack[var5];
                            if (var49 != -1) {
                              var601[0] = new Integer(var49);
                            } else {
                              var601 = null;
                            }

                            if (opcode == 1400) {
                              var15.anObjectArray1171 = var601;
                            }

                            if (opcode == 1401) {
                              var15.anObjectArray1174 = var601;
                            }

                            if (opcode == 1402) {
                              var15.anObjectArray1173 = var601;
                            }

                            if (opcode == 1403) {
                              var15.mouseEnterListener = var601;
                            }

                            if (opcode == 1404) {
                              var15.mouseExitListener = var601;
                            }

                            if (opcode == 1405) {
                              var15.anObjectArray1176 = var601;
                            }

                            if (opcode == 1406) {
                              var15.anObjectArray1178 = var601;
                            }

                            if (opcode == 1407) {
                              var15.configListenerArgs = var601;
                              var15.configTriggers = var38;
                            }

                            if (opcode == 1408) {
                              var15.renderListener = var601;
                            }

                            if (opcode == 1409) {
                              var15.anObjectArray1180 = var601;
                            }

                            if (opcode == 1410) {
                              var15.anObjectArray1177 = var601;
                            }

                            if (opcode == 1411) {
                              var15.anObjectArray1172 = var601;
                            }

                            if (opcode == 1412) {
                              var15.mouseHoverListener = var601;
                            }

                            if (opcode == 1414) {
                              var15.tableListenerArgs = var601;
                              var15.tableModTriggers = var38;
                            }

                            if (opcode == 1415) {
                              var15.skillListenerArgs = var601;
                              var15.skillTriggers = var38;
                            }

                            if (opcode == 1416) {
                              var15.anObjectArray1130 = var601;
                            }

                            if (opcode == 1417) {
                              var15.scrollListener = var601;
                            }

                            if (opcode == 1418) {
                              var15.anObjectArray1181 = var601;
                            }

                            if (opcode == 1419) {
                              var15.anObjectArray1182 = var601;
                            }

                            if (opcode == 1420) {
                              var15.anObjectArray1183 = var601;
                            }

                            if (opcode == 1421) {
                              var15.anObjectArray1184 = var601;
                            }

                            if (opcode == 1422) {
                              var15.anObjectArray1156 = var601;
                            }

                            if (opcode == 1423) {
                              var15.anObjectArray1186 = var601;
                            }

                            if (opcode == 1424) {
                              var15.anObjectArray1187 = var601;
                            }

                            if (opcode == 1425) {
                              var15.anObjectArray1189 = var601;
                            }

                            if (opcode == 1426) {
                              var15.anObjectArray1190 = var601;
                            }

                            if (opcode == 1427) {
                              var15.anObjectArray1188 = var601;
                            }

                            var15.aBool1169 = true;
                            continue;
                          }

                          if (opcode < 1600) {
                            var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                            if (opcode == 1500) {
                              Class3.intStack[var5++] = var15.relativeX;
                              continue;
                            }

                            if (opcode == 1501) {
                              Class3.intStack[var5++] = var15.relativeY;
                              continue;
                            }

                            if (opcode == 1502) {
                              Class3.intStack[var5++] = var15.width;
                              continue;
                            }

                            if (opcode == 1503) {
                              Class3.intStack[var5++] = var15.height * 1227800423;
                              continue;
                            }

                            if (opcode == 1504) {
                              Class3.intStack[var5++] = var15.hidden ? 1 : 0;
                              continue;
                            }

                            if (opcode == 1505) {
                              Class3.intStack[var5++] = var15.parentId;
                              continue;
                            }
                          } else if (opcode < 1700) {
                            var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                            if (opcode == 1600) {
                              Class3.intStack[var5++] = var15.insetX;
                              continue;
                            }

                            if (opcode == 1601) {
                              Class3.intStack[var5++] = var15.insetY;
                              continue;
                            }

                            if (opcode == 1602) {
                              Class3.stringStack[var6++] = var15.text;
                              continue;
                            }

                            if (opcode == 1603) {
                              Class3.intStack[var5++] = var15.viewportWidth;
                              continue;
                            }

                            if (opcode == 1604) {
                              Class3.intStack[var5++] = var15.viewportHeight;
                              continue;
                            }

                            if (opcode == 1605) {
                              Class3.intStack[var5++] = var15.modelZoom;
                              continue;
                            }

                            if (opcode == 1606) {
                              Class3.intStack[var5++] = var15.rotationX;
                              continue;
                            }

                            if (opcode == 1607) {
                              Class3.intStack[var5++] = var15.rotationY;
                              continue;
                            }

                            if (opcode == 1608) {
                              Class3.intStack[var5++] = var15.rotationZ;
                              continue;
                            }

                            if (opcode == 1609) {
                              Class3.intStack[var5++] = var15.alpha;
                              continue;
                            }
                          } else if (opcode < 1800) {
                            var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                            if (opcode == 1700) {
                              Class3.intStack[var5++] = var15.itemId;
                              continue;
                            }

                            if (opcode == 1701) {
                              if (var15.itemId != -1) {
                                Class3.intStack[var5++] = var15.itemQuantity;
                              } else {
                                Class3.intStack[var5++] = 0;
                              }
                              continue;
                            }

                            if (opcode == 1702) {
                              Class3.intStack[var5++] = var15.index;
                              continue;
                            }
                          } else if (opcode < 1900) {
                            var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                            if (opcode == 1800) {
                              Class3.intStack[var5++] = TaskManager
                                  .method314(Class30.getWidgetConfig(var15));
                              continue;
                            }

                            if (opcode == 1801) {
                              --var5;
                              var16 = Class3.intStack[var5];
                              --var16;
                              if (var15.actions != null && var16 < var15.actions.length
                                  && var15.actions[var16] != null) {
                                Class3.stringStack[var6++] = var15.actions[var16];
                                continue;
                              }

                              Class3.stringStack[var6++] = "";
                              continue;
                            }

                            if (opcode == 1802) {
                              if (var15.name == null) {
                                Class3.stringStack[var6++] = "";
                              } else {
                                Class3.stringStack[var6++] = var15.name;
                              }
                              continue;
                            }
                          } else if (opcode >= 1900 && opcode < 2000 || opcode >= 2900 && opcode < 3000) {
                            if (opcode >= 2000) {
                              opcode -= 1000;
                              --var5;
                              var15 = Class94.getWidget(Class3.intStack[var5]);
                            } else {
                              var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                            }

                            if (opcode == 1927) {
                              if (Class3.anInt91 * 1216534379 >= 10) {
                                throw new RuntimeException();
                              }

                              if (var15.anObjectArray1188 == null) {
                                return;
                              }

                              ScriptEvent var59 = new ScriptEvent();
                              var59.widget = var15;
                              var59.args = var15.anObjectArray1188;
                              var59.anInt1436 = Class3.anInt91 + 1898945859;
                              Client.aDeque2164.method475(event);
                              continue;
                            }
                          } else if (opcode < 2600) {
                            --var5;
                            var15 = Class94.getWidget(Class3.intStack[var5]);
                            if (opcode == 2500) {
                              Class3.intStack[var5++] = var15.relativeX;
                              continue;
                            }

                            if (opcode == 2501) {
                              Class3.intStack[var5++] = var15.relativeY;
                              continue;
                            }

                            if (opcode == 2502) {
                              Class3.intStack[var5++] = var15.width;
                              continue;
                            }

                            if (opcode == 2503) {
                              Class3.intStack[var5++] = var15.height * 1227800423;
                              continue;
                            }

                            if (opcode == 2504) {
                              Class3.intStack[var5++] = var15.hidden ? 1 : 0;
                              continue;
                            }

                            if (opcode == 2505) {
                              Class3.intStack[var5++] = var15.parentId;
                              continue;
                            }
                          } else if (opcode < 2700) {
                            --var5;
                            var15 = Class94.getWidget(Class3.intStack[var5]);
                            if (opcode == 2600) {
                              Class3.intStack[var5++] = var15.insetX;
                              continue;
                            }

                            if (opcode == 2601) {
                              Class3.intStack[var5++] = var15.insetY;
                              continue;
                            }

                            if (opcode == 2602) {
                              Class3.stringStack[var6++] = var15.text;
                              continue;
                            }

                            if (opcode == 2603) {
                              Class3.intStack[var5++] = var15.viewportWidth;
                              continue;
                            }

                            if (opcode == 2604) {
                              Class3.intStack[var5++] = var15.viewportHeight;
                              continue;
                            }

                            if (opcode == 2605) {
                              Class3.intStack[var5++] = var15.modelZoom;
                              continue;
                            }

                            if (opcode == 2606) {
                              Class3.intStack[var5++] = var15.rotationX;
                              continue;
                            }

                            if (opcode == 2607) {
                              Class3.intStack[var5++] = var15.rotationY;
                              continue;
                            }

                            if (opcode == 2608) {
                              Class3.intStack[var5++] = var15.rotationZ;
                              continue;
                            }

                            if (opcode == 2609) {
                              Class3.intStack[var5++] = var15.alpha;
                              continue;
                            }
                          } else if (opcode < 2800) {
                            if (opcode == 2700) {
                              --var5;
                              var15 = Class94.getWidget(Class3.intStack[var5]);
                              Class3.intStack[var5++] = var15.itemId;
                              continue;
                            }

                            if (opcode == 2701) {
                              --var5;
                              var15 = Class94.getWidget(Class3.intStack[var5]);
                              if (var15.itemId != -1) {
                                Class3.intStack[var5++] = var15.itemQuantity;
                              } else {
                                Class3.intStack[var5++] = 0;
                              }
                              continue;
                            }

                            if (opcode == 2702) {
                              --var5;
                              var33 = Class3.intStack[var5];
                              InterfaceNode var50 = (InterfaceNode) Client.interfaceNodes
                                  .get((long) var33);
                              if (var50 != null) {
                                Class3.intStack[var5++] = 1;
                              } else {
                                Class3.intStack[var5++] = 0;
                              }
                              continue;
                            }

                            if (opcode == 2706) {
                              Class3.intStack[var5++] = Client.anInt2226;
                              continue;
                            }
                          } else if (opcode < 2900) {
                            --var5;
                            var15 = Class94.getWidget(Class3.intStack[var5]);
                            if (opcode == 2800) {
                              Class3.intStack[var5++] = TaskManager
                                  .method314(Class30.getWidgetConfig(var15));
                              continue;
                            }

                            if (opcode == 2801) {
                              --var5;
                              var16 = Class3.intStack[var5];
                              --var16;
                              if (var15.actions != null && var16 < var15.actions.length
                                  && var15.actions[var16] != null) {
                                Class3.stringStack[var6++] = var15.actions[var16];
                                continue;
                              }

                              Class3.stringStack[var6++] = "";
                              continue;
                            }

                            if (opcode == 2802) {
                              if (var15.name == null) {
                                Class3.stringStack[var6++] = "";
                              } else {
                                Class3.stringStack[var6++] = var15.name;
                              }
                              continue;
                            }
                          } else {
                            int var48;
                            int var62;
                            char var86;
                            int var58;
                            boolean var611;
                            if (opcode < 3200) {
                              if (opcode == 3100) {
                                --var6;
                                var83 = Class3.stringStack[var6];
                                Class75.method334(0, "", var83);
                                continue;
                              }

                              if (opcode == 3101) {
                                var5 -= 2;
                                Class43.method229(Class68.myPlayer, Class3.intStack[var5],
                                    Class3.intStack[var5 + 1]);
                                continue;
                              }

                              if (opcode == 3103) {
                                IsaacRandom.method63();
                                continue;
                              }

                              boolean var60;
                              if (opcode == 3104) {
                                --var6;
                                var83 = Class3.stringStack[var6];
                                var16 = 0;
                                var60 = false;
                                var611 = false;
                                var48 = 0;
                                var58 = var83.length();
                                int var65 = 0;

                                while (true) {
                                  if (var65 >= var58) {
                                    var41 = var611;
                                    break;
                                  }

                                  label3347: {
                                    var86 = var83.charAt(var65);
                                    if (var65 == 0) {
                                      if (var86 == 45) {
                                        var60 = true;
                                        break label3347;
                                      }

                                      if (var86 == 43) {
                                        break label3347;
                                      }
                                    }

                                    if (var86 >= 48 && var86 <= 57) {
                                      var62 = var86 - 48;
                                    } else if (var86 >= 65 && var86 <= 90) {
                                      var62 = var86 - 55;
                                    } else {
                                      if (var86 < 97 || var86 > 122) {
                                        var41 = false;
                                        break;
                                      }

                                      var62 = var86 - 87;
                                    }

                                    if (var62 >= 10) {
                                      var41 = false;
                                      break;
                                    }

                                    if (var60) {
                                      var62 = -var62;
                                    }

                                    int var61 = var48 * 10 + var62;
                                    if (var61 / 10 != var48) {
                                      var41 = false;
                                      break;
                                    }

                                    var48 = var61;
                                    var611 = true;
                                  }

                                  ++var65;
                                }

                                if (var41) {
                                  var45 = AnimationSkin.method535(var83, 10, true);
                                  var16 = var45;
                                }

                                Client.outBuffer.putHeader(79);
                                Client.outBuffer.putInt(var16);
                                continue;
                              }

                              if (opcode == 3105) {
                                --var6;
                                var83 = Class3.stringStack[var6];
                                Client.outBuffer.putHeader(84);
                                Client.outBuffer.putByte(var83.length() + 1);
                                Client.outBuffer.putString(var83);
                                continue;
                              }

                              if (opcode == 3106) {
                                --var6;
                                var83 = Class3.stringStack[var6];
                                Client.outBuffer.putHeader(58);
                                Client.outBuffer.putByte(var83.length() + 1);
                                Client.outBuffer.putString(var83);
                                continue;
                              }

                              if (opcode == 3107) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                --var6;
                                var54 = Class3.stringStack[var6];
                                var35 = GPI.localPlayerCount;
                                int[] var76 = GPI.localPlayerIndices;
                                var60 = false;

                                for (var20 = 0; var20 < var35; var20++) {
                                  Player var68 = Client.playerArray[var76[var20]];
                                  if (var68 != null && Class68.myPlayer != var68 && var68.name != null
                                      && var68.name.equalsIgnoreCase(var54)) {
                                    if (var33 == 1) {
                                      Client.outBuffer.putHeader(234);
                                      Client.outBuffer.putByteS(0);
                                      Client.outBuffer.putShortA(var76[var20]);
                                    } else if (var33 == 4) {
                                      Client.outBuffer.putHeader(83);
                                      Client.outBuffer.putByte(0);
                                      Client.outBuffer.putShort(var76[var20]);
                                    } else if (var33 == 6) {
                                      Client.outBuffer.putHeader(4);
                                      Client.outBuffer.putByteC(0);
                                      Client.outBuffer.putShortA(var76[var20]);
                                    } else if (var33 == 7) {
                                      Client.outBuffer.putHeader(224);
                                      Client.outBuffer.putByteS(0);
                                      Client.outBuffer.putShort(var76[var20]);
                                    }

                                    var60 = true;
                                    break;
                                  }
                                }

                                if (!var60) {
                                  Class75.method334(4, "", "Unable to find " + var54);
                                }
                                continue;
                              }

                              if (opcode == 3108) {
                                var5 -= 3;
                                var33 = Class3.intStack[var5];
                                var16 = Class3.intStack[var5 + 1];
                                var35 = Class3.intStack[var5 + 2];
                                var18 = Class94.getWidget(var35);
                                Class68.method327(var18, var33, var16);
                                continue;
                              }

                              if (opcode == 3109) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5];
                                var16 = Class3.intStack[var5 + 1];
                                var17 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                                Class68.method327(var17, var33, var16);
                                continue;
                              }

                              if (opcode == 3110) {
                                --var5;
                                ClanMate.aBool1221 = Class3.intStack[var5] == 1;
                                continue;
                              }

                              if (opcode == 3111) {
                                Class3.intStack[var5++] = AnimationSkin.settings.hideRoofs ? 1 : 0;
                                continue;
                              }

                              if (opcode == 3112) {
                                --var5;
                                AnimationSkin.settings.hideRoofs = Class3.intStack[var5] == 1;
                                Class75.serializeSettings();
                                continue;
                              }

                              if (opcode == 3113) {
                                --var6;
                                var83 = Class3.stringStack[var6];
                                --var5;
                                var55 = Class3.intStack[var5] == 1;
                                Class96_Sub1.method503(var83, var55, "openjs", false);
                                continue;
                              }

                              if (opcode == 3115) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Client.outBuffer.putHeader(160);
                                Client.outBuffer.putShort(var33);
                                continue;
                              }

                              if (opcode == 3116) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                var6 -= 2;
                                var54 = Class3.stringStack[var6];
                                var93 = Class3.stringStack[var6 + 1];
                                if (var54.length() <= 500 && var93.length() <= 500) {
                                  Client.outBuffer.putHeader(196);
                                  Client.outBuffer.putShort(TileDecorationStub.getLength(var54) + 1
                                      + TileDecorationStub.getLength(var93));
                                  Client.outBuffer.putString(var93);
                                  Client.outBuffer.putByteC(var33);
                                  Client.outBuffer.putString(var54);
                                }
                                continue;
                              }
                            } else if (opcode < 3300) {
                              if (opcode == 3200) {
                                var5 -= 3;
                                EntityMarker.method139(Class3.intStack[var5], Class3.intStack[var5 + 1],
                                    Class3.intStack[var5 + 2]);
                                continue;
                              }

                              if (opcode == 3201) {
                                --var5;
                                Class22.method158(Class3.intStack[var5]);
                                continue;
                              }

                              if (opcode == 3202) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5];
                                if (Client.anInt2201 != 0 && var33 != -1) {
                                  Class69.method328(PlayerConfig.midiTack2Index, var33, 0,
                                      Client.anInt2201, false);
                                  Client.aBool2191 = true;
                                }
                                continue;
                              }
                            } else if (opcode < 3400) {
                              if (opcode == 3300) {
                                Class3.intStack[var5++] = Client.engineCycle;
                                continue;
                              }

                              ItemTable var63;
                              if (opcode == 3301) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5];
                                var16 = Class3.intStack[var5 + 1];
                                var38 = Class3.intStack;
                                var45 = var5++;
                                var63 = (ItemTable) ItemTable.itemTables.get((long) var33);
                                if (var63 == null) {
                                  var49 = -1;
                                } else if (var16 >= 0 && var16 < var63.ids.length) {
                                  var49 = var63.ids[var16];
                                } else {
                                  var49 = -1;
                                }

                                var38[var45] = var49;
                                continue;
                              }

                              if (opcode == 3302) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5];
                                var16 = Class3.intStack[var5 + 1];
                                Class3.intStack[var5++] = Class37.method213(var33, var16);
                                continue;
                              }

                              if (opcode == 3303) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5];
                                var16 = Class3.intStack[var5 + 1];
                                var38 = Class3.intStack;
                                var45 = var5++;
                                var63 = (ItemTable) ItemTable.itemTables.get((long) var33);
                                if (var63 == null) {
                                  var49 = 0;
                                } else if (var16 == -1) {
                                  var49 = 0;
                                } else {
                                  var48 = 0;

                                  for (var58 = 0; var58 < var63.quantities.length; var58++) {
                                    if (var63.ids[var58] == var16) {
                                      var48 += var63.quantities[var58];
                                    }
                                  }

                                  var49 = var48;
                                }

                                var38[var45] = var49;
                                continue;
                              }

                              if (opcode == 3304) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Class3.intStack[var5++] = Class91.getInvType(var33).anInt1501;
                                continue;
                              }

                              if (opcode == 3305) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Class3.intStack[var5++] = Client.levels[var33];
                                continue;
                              }

                              if (opcode == 3306) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Class3.intStack[var5++] = Client.experiences[var33];
                                continue;
                              }

                              if (opcode == 3307) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Class3.intStack[var5++] = Client.currentLevels[var33];
                                continue;
                              }

                              if (opcode == 3308) {
                                var33 = InterfaceNode.floorLevel * -1331355705;
                                var16 = Node_Sub10.chunkLeftX + (Class68.myPlayer.strictX >> 7);
                                var35 = (Class68.myPlayer.strictY >> 7) + VarClientHub.chunkLeftY;
                                Class3.intStack[var5++] = (var16 << 14) + (var33 << 28) + var35;
                                continue;
                              }

                              if (opcode == 3309) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Class3.intStack[var5++] = var33 >> 14 & 0x3fff;
                                continue;
                              }

                              if (opcode == 3310) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Class3.intStack[var5++] = var33 >> 28;
                                continue;
                              }

                              if (opcode == 3311) {
                                --var5;
                                var33 = Class3.intStack[var5];
                                Class3.intStack[var5++] = var33 & 0x3fff;
                                continue;
                              }

                              if (opcode == 3312) {
                                Class3.intStack[var5++] = Client.membersWorld ? 1 : 0;
                                continue;
                              }

                              if (opcode == 3313) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5] + '\u8000';
                                var16 = Class3.intStack[var5 + 1];
                                var38 = Class3.intStack;
                                var45 = var5++;
                                var63 = (ItemTable) ItemTable.itemTables.get((long) var33);
                                if (var63 == null) {
                                  var49 = -1;
                                } else if (var16 >= 0 && var16 < var63.ids.length) {
                                  var49 = var63.ids[var16];
                                } else {
                                  var49 = -1;
                                }

                                var38[var45] = var49;
                                continue;
                              }

                              if (opcode == 3314) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5] + '\u8000';
                                var16 = Class3.intStack[var5 + 1];
                                Class3.intStack[var5++] = Class37.method213(var33, var16);
                                continue;
                              }

                              if (opcode == 3315) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5] + '\u8000';
                                var16 = Class3.intStack[var5 + 1];
                                var38 = Class3.intStack;
                                var45 = var5++;
                                var63 = (ItemTable) ItemTable.itemTables.get((long) var33);
                                if (var63 == null) {
                                  var49 = 0;
                                } else if (var16 == -1) {
                                  var49 = 0;
                                } else {
                                  var48 = 0;

                                  for (var58 = 0; var58 < var63.quantities.length; var58++) {
                                    if (var63.ids[var58] == var16) {
                                      var48 += var63.quantities[var58];
                                    }
                                  }

                                  var49 = var48;
                                }

                                var38[var45] = var49;
                                continue;
                              }

                              if (opcode == 3316) {
                                if (Client.myRights >= 2) {
                                  Class3.intStack[var5++] = Client.myRights;
                                } else {
                                  Class3.intStack[var5++] = 0;
                                }
                                continue;
                              }

                              if (opcode == 3317) {
                                Class3.intStack[var5++] = Client.anInt2189;
                                continue;
                              }

                              if (opcode == 3318) {
                                Class3.intStack[var5++] = Client.myWorld;
                                continue;
                              }

                              if (opcode == 3321) {
                                Class3.intStack[var5++] = Client.energy;
                                continue;
                              }

                              if (opcode == 3322) {
                                Class3.intStack[var5++] = Client.weight;
                                continue;
                              }

                              if (opcode == 3323) {
                                if (Client.aBool2179) {
                                  Class3.intStack[var5++] = 1;
                                } else {
                                  Class3.intStack[var5++] = 0;
                                }
                                continue;
                              }

                              if (opcode == 3324) {
                                Class3.intStack[var5++] = Client.myWorldFlags;
                                continue;
                              }
                            } else if (opcode < 3500) {
                              EnumType var66;
                              if (opcode == 3400) {
                                var5 -= 2;
                                var33 = Class3.intStack[var5];
                                var16 = Class3.intStack[var5 + 1];
                                var66 = ObjectType.getEnumType(var33);
                                if (var66.valType != 115) {
                                  ;
                                }

                                for (var45 = 0; var45 < var66.size; var45++) {
                                  if (var66.keys[var45] == var16) {
                                    Class3.stringStack[var6++] = var66.stringVals[var45];
                                    var66 = null;
                                    break;
                                  }
                                }

                                if (var66 != null) {
                                  Class3.stringStack[var6++] = var66.defaultString;
                                }
                                continue;
                              }

                              if (opcode == 3408) {
                                var5 -= 4;
                                var33 = Class3.intStack[var5];
                                var16 = Class3.intStack[var5 + 1];
                                var35 = Class3.intStack[var5 + 2];
                                var45 = Class3.intStack[var5 + 3];
                                var66 = ObjectType.getEnumType(var35);
                                if (var66.keyType == var33 && var66.valType == var16) {
                                  for (var20 = 0; var20 < var66.size; var20++) {
                                    if (var66.keys[var20] == var45) {
                                      if (var16 == 115) {
                                        Class3.stringStack[var6++] = var66.stringVals[var20];
                                      } else {
                                        Class3.intStack[var5++] = var66.intVals[var20];
                                      }

                                      var66 = null;
                                      break;
                                    }
                                  }

                                  if (var66 != null) {
                                    if (var16 == 115) {
                                      Class3.stringStack[var6++] = var66.defaultString;
                                    } else {
                                      Class3.intStack[var5++] = var66.defaultInt;
                                    }
                                  }
                                  continue;
                                }

                                if (var16 == 115) {
                                  Class3.stringStack[var6++] = "null";
                                } else {
                                  Class3.intStack[var5++] = 0;
                                }
                                continue;
                              }
                            } else {
                              String var731;
                              if (opcode < 3700) {
                                if (opcode == 3600) {
                                  if (Client.friendListSize == 0) {
                                    Class3.intStack[var5++] = -2;
                                  } else if (Client.friendListSize == 1) {
                                    Class3.intStack[var5++] = -1;
                                  } else {
                                    Class3.intStack[var5++] = Client.anInt2184;
                                  }
                                  continue;
                                }

                                if (opcode == 3601) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (Client.friendListSize == 2 && var33 < Client.anInt2184) {
                                    Class3.stringStack[var6++] = Client.friendedPlayers[var33].displayName;
                                    Class3.stringStack[var6++] = Client.friendedPlayers[var33].previousName;
                                    continue;
                                  }

                                  Class3.stringStack[var6++] = "";
                                  Class3.stringStack[var6++] = "";
                                  continue;
                                }

                                if (opcode == 3602) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (Client.friendListSize == 2 && var33 < Client.anInt2184) {
                                    Class3.intStack[var5++] = Client.friendedPlayers[var33].world;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = 0;
                                  continue;
                                }

                                if (opcode == 3603) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (Client.friendListSize == 2 && var33 < Client.anInt2184) {
                                    Class3.intStack[var5++] = Client.friendedPlayers[var33].anInt737;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = 0;
                                  continue;
                                }

                                if (opcode == 3604) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  --var5;
                                  var16 = Class3.intStack[var5];
                                  Client.outBuffer.putHeader(62);
                                  Client.outBuffer.putByte(TileDecorationStub.getLength(var83) + 1);
                                  Client.outBuffer.putString(var83);
                                  Client.outBuffer.putByteS(var16);
                                  continue;
                                }

                                IgnoredPlayer var64;
                                FriendedPlayer var67;
                                String var681;
                                if (opcode == 3605) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (var83 == null) {
                                    continue;
                                  }

                                  if ((Client.anInt2184 < 200 || Client.anInt2106 == 1)
                                      && Client.anInt2184 < 400) {
                                    var54 = VarPlayerType.method728(var83,
                                        Class48_Sub1.aClass124_1297);
                                    if (var54 == null) {
                                      continue;
                                    }

                                    for (var35 = 0; var35 < Client.anInt2184; var35++) {
                                      var67 = Client.friendedPlayers[var35];
                                      var681 = VarPlayerType.method728(var67.displayName,
                                          Class48_Sub1.aClass124_1297);
                                      if (var681 != null && var681.equals(var54)) {
                                        Class75.method334(30, "",
                                            var83 + " is already on your friend list");
                                        continue label3072;
                                      }

                                      if (var67.previousName != null) {
                                        var731 = VarPlayerType.method728(var67.previousName,
                                            Class48_Sub1.aClass124_1297);
                                        if (var731 != null && var731.equals(var54)) {
                                          Class75.method334(30, "",
                                              var83 + " is already on your friend list");
                                          continue label3072;
                                        }
                                      }
                                    }

                                    for (var35 = 0; var35 < Client.anInt2229; var35++) {
                                      var64 = Client.ignoredPlayers[var35];
                                      var681 = VarPlayerType.method728(var64.displayName,
                                          Class48_Sub1.aClass124_1297);
                                      if (var681 != null && var681.equals(var54)) {
                                        Class75.method334(30, "", "Please remove " + var83
                                            + " from your ignore list first");
                                        continue label3072;
                                      }

                                      if (var64.previousName != null) {
                                        var731 = VarPlayerType.method728(var64.previousName,
                                            Class48_Sub1.aClass124_1297);
                                        if (var731 != null && var731.equals(var54)) {
                                          Class75.method334(30, "", "Please remove " + var83
                                              + " from your ignore list first");
                                          continue label3072;
                                        }
                                      }
                                    }

                                    if (VarPlayerType.method728(Class68.myPlayer.name,
                                        Class48_Sub1.aClass124_1297).equals(var54)) {
                                      Class75.method334(30, "",
                                          "You can\'t add yourself to your own friend list");
                                    } else {
                                      Client.outBuffer.putHeader(164);
                                      Client.outBuffer
                                          .putByte(TileDecorationStub.getLength(var83));
                                      Client.outBuffer.putString(var83);
                                    }
                                    continue;
                                  }

                                  Class75.method334(30, "",
                                      "Your friend list is full. Max of 200 for free users, and 400 for members");
                                  continue;
                                }

                                if (opcode == 3606) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  SequenceType.method684(var83);
                                  continue;
                                }

                                if (opcode == 3607) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (var83 == null) {
                                    continue;
                                  }

                                  if ((Client.anInt2229 < 100 || Client.anInt2106 == 1)
                                      && Client.anInt2229 < 400) {
                                    var54 = VarPlayerType.method728(var83,
                                        Class48_Sub1.aClass124_1297);
                                    if (var54 == null) {
                                      continue;
                                    }

                                    for (var35 = 0; var35 < Client.anInt2229; var35++) {
                                      var64 = Client.ignoredPlayers[var35];
                                      var681 = VarPlayerType.method728(var64.displayName,
                                          Class48_Sub1.aClass124_1297);
                                      if (var681 != null && var681.equals(var54)) {
                                        Class75.method334(31, "",
                                            var83 + " is already on your ignore list");
                                        continue label3072;
                                      }

                                      if (var64.previousName != null) {
                                        var731 = VarPlayerType.method728(var64.previousName,
                                            Class48_Sub1.aClass124_1297);
                                        if (var731 != null && var731.equals(var54)) {
                                          Class75.method334(31, "",
                                              var83 + " is already on your ignore list");
                                          continue label3072;
                                        }
                                      }
                                    }

                                    for (var35 = 0; var35 < Client.anInt2184; var35++) {
                                      var67 = Client.friendedPlayers[var35];
                                      var681 = VarPlayerType.method728(var67.displayName,
                                          Class48_Sub1.aClass124_1297);
                                      if (var681 != null && var681.equals(var54)) {
                                        Class75.method334(31, "", "Please remove " + var83
                                            + " from your friend list first");
                                        continue label3072;
                                      }

                                      if (var67.previousName != null) {
                                        var731 = VarPlayerType.method728(var67.previousName,
                                            Class48_Sub1.aClass124_1297);
                                        if (var731 != null && var731.equals(var54)) {
                                          Class75.method334(31, "", "Please remove " + var83
                                              + " from your friend list first");
                                          continue label3072;
                                        }
                                      }
                                    }

                                    if (VarPlayerType.method728(Class68.myPlayer.name,
                                        Class48_Sub1.aClass124_1297).equals(var54)) {
                                      Class75.method334(31, "",
                                          "You can\'t add yourself to your own ignore list");
                                    } else {
                                      Client.outBuffer.putHeader(178);
                                      Client.outBuffer
                                          .putByte(TileDecorationStub.getLength(var83));
                                      Client.outBuffer.putString(var83);
                                    }
                                    continue;
                                  }

                                  Class75.method334(31, "",
                                      "Your ignore list is full. Max of 100 for free users, and 400 for members");
                                  continue;
                                }

                                if (opcode == 3608) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (var83 == null) {
                                    continue;
                                  }

                                  var54 = VarPlayerType.method728(var83, Class48_Sub1.aClass124_1297);
                                  if (var54 == null) {
                                    continue;
                                  }

                                  var35 = 0;

                                  while (true) {
                                    if (var35 >= Client.anInt2229) {
                                      continue label3072;
                                    }

                                    var64 = Client.ignoredPlayers[var35];
                                    var681 = var64.displayName;
                                    var731 = VarPlayerType.method728(var681,
                                        Class48_Sub1.aClass124_1297);
                                    if (ItemTable.method646(var83, var54, var681, var731)) {
                                      --Client.anInt2229;

                                      for (var48 = var35; var48 < Client.anInt2229; var48++) {
                                        Client.ignoredPlayers[var48] = Client.ignoredPlayers[var48
                                            + 1];
                                      }

                                      Client.anInt2114 = Client.anInt2151;
                                      Client.outBuffer.putHeader(159);
                                      Client.outBuffer
                                          .putByte(TileDecorationStub.getLength(var83));
                                      Client.outBuffer.putString(var83);
                                      continue label3072;
                                    }

                                    ++var35;
                                  }
                                }

                                if (opcode == 3609) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  Permission[] var72 = new Permission[] { Permission.PLAYER,
                                      Permission.PLAYER_MOD, Permission.JAGEX_MOD,
                                      Permission.IRONMAN, Permission.HARDCORE_IRONMAN };
                                  Permission[] var77 = var72;

                                  for (var45 = 0; var45 < var77.length; var45++) {
                                    Permission var70 = var77[var45];
                                    if (var70.sprite != -1
                                        && var83.startsWith(Class41.method223(var70.sprite))) {
                                      var83 = var83.substring(
                                          Integer.toString(var70.sprite).length() + 6);
                                      break;
                                    }
                                  }

                                  Class3.intStack[var5++] = AnimationSkin.isFriended(var83, false) ? 1
                                      : 0;
                                  continue;
                                }

                                String[] var57;
                                String var701;
                                if (opcode == 3611) {
                                  if (Client.clanChatOwner != null) {
                                    var57 = Class3.stringStack;
                                    var16 = var6++;
                                    var701 = Client.clanChatOwner;
                                    var681 = OverlayType
                                        .method716(GZipDecompressor.method250(var701));
                                    if (var681 == null) {
                                      var681 = "";
                                    }

                                    var57[var16] = var681;
                                  } else {
                                    Class3.stringStack[var6++] = "";
                                  }
                                  continue;
                                }

                                if (opcode == 3612) {
                                  if (Client.clanChatOwner != null) {
                                    Class3.intStack[var5++] = LoginScreenWidget.clanChatSize;
                                  } else {
                                    Class3.intStack[var5++] = 0;
                                  }
                                  continue;
                                }

                                if (opcode == 3613) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (Client.clanChatOwner != null && var33 < LoginScreenWidget.clanChatSize) {
                                    Class3.stringStack[var6++] = InterfaceNode.clanMates[var33].displayName;
                                    continue;
                                  }

                                  Class3.stringStack[var6++] = "";
                                  continue;
                                }

                                if (opcode == 3614) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (Client.clanChatOwner != null && var33 < LoginScreenWidget.clanChatSize) {
                                    Class3.intStack[var5++] = InterfaceNode.clanMates[var33].world;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = 0;
                                  continue;
                                }

                                if (opcode == 3615) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (Client.clanChatOwner != null && var33 < LoginScreenWidget.clanChatSize) {
                                    Class3.intStack[var5++] = InterfaceNode.clanMates[var33].rank;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = 0;
                                  continue;
                                }

                                if (opcode == 3616) {
                                  Class3.intStack[var5++] = Class43.aByte451;
                                  continue;
                                }

                                if (opcode == 3617) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (InterfaceNode.clanMates != null) {
                                    Client.outBuffer.putHeader(166);
                                    Client.outBuffer.putByte(TileDecorationStub.getLength(var83));
                                    Client.outBuffer.putString(var83);
                                  }
                                  continue;
                                }

                                if (opcode == 3618) {
                                  Class3.intStack[var5++] = Client.clanChatRank;
                                  continue;
                                }

                                if (opcode == 3619) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (!var83.equals("")) {
                                    Client.outBuffer.putHeader(233);
                                    Client.outBuffer.putByte(TileDecorationStub.getLength(var83));
                                    Client.outBuffer.putString(var83);
                                  }
                                  continue;
                                }

                                if (opcode == 3620) {
                                  Client.outBuffer.putHeader(233);
                                  Client.outBuffer.putByte(0);
                                  continue;
                                }

                                if (opcode == 3621) {
                                  if (Client.friendListSize == 0) {
                                    Class3.intStack[var5++] = -1;
                                  } else {
                                    Class3.intStack[var5++] = Client.anInt2229;
                                  }
                                  continue;
                                }

                                if (opcode == 3622) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (Client.friendListSize != 0 && var33 < Client.anInt2229) {
                                    Class3.stringStack[var6++] = Client.ignoredPlayers[var33].displayName;
                                    Class3.stringStack[var6++] = Client.ignoredPlayers[var33].previousName;
                                    continue;
                                  }

                                  Class3.stringStack[var6++] = "";
                                  Class3.stringStack[var6++] = "";
                                  continue;
                                }

                                if (opcode == 3623) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (var83.startsWith(Class41.method223(0))
                                      || var83.startsWith(Class41.method223(1))) {
                                    var83 = var83.substring(7);
                                  }

                                  Class3.intStack[var5++] = World.method485(var83) ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 3624) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  if (InterfaceNode.clanMates != null && var33 < LoginScreenWidget.clanChatSize
                                      && InterfaceNode.clanMates[var33].displayName
                                          .equalsIgnoreCase(Class68.myPlayer.name)) {
                                    Class3.intStack[var5++] = 1;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = 0;
                                  continue;
                                }

                                if (opcode == 3625) {
                                  if (Client.clanChatName != null) {
                                    var57 = Class3.stringStack;
                                    var16 = var6++;
                                    var701 = Client.clanChatName;
                                    var681 = OverlayType
                                        .method716(GZipDecompressor.method250(var701));
                                    if (var681 == null) {
                                      var681 = "";
                                    }

                                    var57[var16] = var681;
                                  } else {
                                    Class3.stringStack[var6++] = "";
                                  }
                                  continue;
                                }
                              } else if (opcode < 4000) {
                                if (opcode == 3903) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Client.localExchangeOffers[var33]
                                      .method368();
                                  continue;
                                }

                                if (opcode == 3904) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Client.localExchangeOffers[var33].itemId;
                                  continue;
                                }

                                if (opcode == 3905) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Client.localExchangeOffers[var33].price;
                                  continue;
                                }

                                if (opcode == 3906) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Client.localExchangeOffers[var33].itemQuantity;
                                  continue;
                                }

                                if (opcode == 3907) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Client.localExchangeOffers[var33].transferred;
                                  continue;
                                }

                                if (opcode == 3908) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Client.localExchangeOffers[var33].spent;
                                  continue;
                                }

                                if (opcode == 3910) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var16 = Client.localExchangeOffers[var33].method372();
                                  Class3.intStack[var5++] = var16 == 0 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 3911) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var16 = Client.localExchangeOffers[var33].method372();
                                  Class3.intStack[var5++] = var16 == 2 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 3912) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var16 = Client.localExchangeOffers[var33].method372();
                                  Class3.intStack[var5++] = var16 == 5 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 3913) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var16 = Client.localExchangeOffers[var33].method372();
                                  Class3.intStack[var5++] = var16 == 1 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 3914) {
                                  --var5;
                                  var611 = Class3.intStack[var5] == 1;
                                  if (Class70.aClass114_588 != null) {
                                    Class70.aClass114_588.method438(Class114.aComparator792,
                                        var611);
                                  }
                                  continue;
                                }

                                if (opcode == 3915) {
                                  --var5;
                                  var611 = Class3.intStack[var5] == 1;
                                  if (Class70.aClass114_588 != null) {
                                    Class70.aClass114_588.method438(Class114.aComparator791,
                                        var611);
                                  }
                                  continue;
                                }

                                if (opcode == 3916) {
                                  var5 -= 2;
                                  var611 = Class3.intStack[var5] == 1;
                                  var55 = Class3.intStack[var5 + 1] == 1;
                                  if (Class70.aClass114_588 != null) {
                                    Class70.aClass114_588.method438(new Class37(var55), var611);
                                  }
                                  continue;
                                }

                                if (opcode == 3917) {
                                  --var5;
                                  var611 = Class3.intStack[var5] == 1;
                                  if (Class70.aClass114_588 != null) {
                                    Class70.aClass114_588.method438(Class114.aComparator790,
                                        var611);
                                  }
                                  continue;
                                }

                                if (opcode == 3918) {
                                  --var5;
                                  var611 = Class3.intStack[var5] == 1;
                                  if (Class70.aClass114_588 != null) {
                                    Class70.aClass114_588.method438(Class114.aComparator794,
                                        var611);
                                  }
                                  continue;
                                }

                                if (opcode == 3919) {
                                  Class3.intStack[var5++] = Class70.aClass114_588 == null ? 0
                                      : Class70.aClass114_588.aList793.size();
                                  continue;
                                }

                                Class115 var69;
                                if (opcode == 3920) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var69 = (Class115) Class70.aClass114_588.aList793.get(var33);
                                  Class3.intStack[var5++] = var69.anInt799;
                                  continue;
                                }

                                if (opcode == 3921) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var69 = (Class115) Class70.aClass114_588.aList793.get(var33);
                                  Class3.stringStack[var6++] = var69.method440();
                                  continue;
                                }

                                if (opcode == 3922) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var69 = (Class115) Class70.aClass114_588.aList793.get(var33);
                                  Class3.stringStack[var6++] = var69.method439();
                                  continue;
                                }

                                if (opcode == 3923) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var69 = (Class115) Class70.aClass114_588.aList793.get(var33);
                                  long var861 = AnimationSkin.currentTimeMs() - Huffman.aLong449
                                      - var69.aLong797;
                                  var49 = (int) (var861 / 3600000L);
                                  var20 = (int) ((var861 - (long) (var49 * 3600000)) / 60000L);
                                  var48 = (int) ((var861 - (long) (var49 * 3600000)
                                      - (long) (var20 * '\uea60')) / 1000L);
                                  String var79 = var49 + ":" + var20 / 10 + var20 % 10 + ":"
                                      + var48 / 10 + var48 % 10;
                                  Class3.stringStack[var6++] = var79;
                                  continue;
                                }

                                if (opcode == 3924) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var69 = (Class115) Class70.aClass114_588.aList793.get(var33);
                                  Class3.intStack[var5++] = var69.anExchangeOffer796.itemQuantity;
                                  continue;
                                }

                                if (opcode == 3925) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var69 = (Class115) Class70.aClass114_588.aList793.get(var33);
                                  Class3.intStack[var5++] = var69.anExchangeOffer796.price;
                                  continue;
                                }

                                if (opcode == 3926) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var69 = (Class115) Class70.aClass114_588.aList793.get(var33);
                                  Class3.intStack[var5++] = var69.anExchangeOffer796.itemId;
                                  continue;
                                }
                              } else if (opcode < 4100) {
                                if (opcode == 4000) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 + var16;
                                  continue;
                                }

                                if (opcode == 4001) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 - var16;
                                  continue;
                                }

                                if (opcode == 4002) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 * var16;
                                  continue;
                                }

                                if (opcode == 4003) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 / var16;
                                  continue;
                                }

                                if (opcode == 4004) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = (int) (Math.random() * (double) var33);
                                  continue;
                                }

                                if (opcode == 4005) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = (int) (Math.random()
                                      * (double) (var33 + 1));
                                  continue;
                                }

                                if (opcode == 4006) {
                                  var5 -= 5;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  var35 = Class3.intStack[var5 + 2];
                                  var45 = Class3.intStack[var5 + 3];
                                  var49 = Class3.intStack[var5 + 4];
                                  Class3.intStack[var5++] = (var49 - var35) * (var16 - var33)
                                      / (var45 - var35) + var33;
                                  continue;
                                }

                                if (opcode == 4007) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 * var16 / 100 + var33;
                                  continue;
                                }

                                if (opcode == 4008) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = 1 << var16 | var33;
                                  continue;
                                }

                                if (opcode == 4009) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = -1 - (1 << var16) & var33;
                                  continue;
                                }

                                if (opcode == 4010) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = (1 << var16 & var33) != 0 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 4011) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 % var16;
                                  continue;
                                }

                                if (opcode == 4012) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  if (var33 == 0) {
                                    Class3.intStack[var5++] = 0;
                                  } else {
                                    Class3.intStack[var5++] = (int) Math.pow((double) var33,
                                        (double) var16);
                                  }
                                  continue;
                                }

                                if (opcode == 4013) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  if (var33 == 0) {
                                    Class3.intStack[var5++] = 0;
                                  } else if (var16 == 0) {
                                    Class3.intStack[var5++] = Integer.MAX_VALUE;
                                  } else {
                                    Class3.intStack[var5++] = (int) Math.pow((double) var33,
                                        1.0D / (double) var16);
                                  }
                                  continue;
                                }

                                if (opcode == 4014) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 & var16;
                                  continue;
                                }

                                if (opcode == 4015) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class3.intStack[var5++] = var33 | var16;
                                  continue;
                                }
                              } else if (opcode < 4200) {
                                if (opcode == 4100) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  --var5;
                                  var16 = Class3.intStack[var5];
                                  Class3.stringStack[var6++] = var83 + var16;
                                  continue;
                                }

                                if (opcode == 4101) {
                                  var6 -= 2;
                                  var83 = Class3.stringStack[var6];
                                  var54 = Class3.stringStack[var6 + 1];
                                  Class3.stringStack[var6++] = var83 + var54;
                                  continue;
                                }

                                if (opcode == 4102) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  --var5;
                                  var16 = Class3.intStack[var5];
                                  var73 = Class3.stringStack;
                                  var45 = var6++;
                                  if (var16 < 0) {
                                    var731 = Integer.toString(var16);
                                  } else {
                                    var731 = Class56.method284(var16, 10, true);
                                  }

                                  var73[var45] = var83 + var731;
                                  continue;
                                }

                                if (opcode == 4103) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  Class3.stringStack[var6++] = var83.toLowerCase();
                                  continue;
                                }

                                if (opcode == 4104) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  long var74 = ((long) var33 + 11745L) * 86400000L;
                                  Class3.aCalendar89.setTime(new Date(var74));
                                  var45 = Class3.aCalendar89.get(5);
                                  var49 = Class3.aCalendar89.get(2);
                                  var20 = Class3.aCalendar89.get(1);
                                  Class3.stringStack[var6++] = var45 + "-"
                                      + Class3.aStringArray90[var49] + "-" + var20;
                                  continue;
                                }

                                if (opcode == 4105) {
                                  var6 -= 2;
                                  var83 = Class3.stringStack[var6];
                                  var54 = Class3.stringStack[var6 + 1];
                                  if (Class68.myPlayer.config != null
                                      && Class68.myPlayer.config.female) {
                                    Class3.stringStack[var6++] = var54;
                                    continue;
                                  }

                                  Class3.stringStack[var6++] = var83;
                                  continue;
                                }

                                if (opcode == 4106) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.stringStack[var6++] = Integer.toString(var33);
                                  continue;
                                }

                                if (opcode == 4107) {
                                  var6 -= 2;
                                  Class3.intStack[var5++] = ByteBuf
                                      .method603(Class96_Sub1.method502(Class3.stringStack[var6],
                                          Class3.stringStack[var6 + 1], Client.languageId));
                                  continue;
                                }

                                byte[] var71;
                                DualNode_Sub13_Sub3_Sub1 var80;
                                if (opcode == 4108) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  var5 -= 2;
                                  var16 = Class3.intStack[var5];
                                  var35 = Class3.intStack[var5 + 1];
                                  var71 = Class2.fontMetricsIndex.getFile(var35, 0);
                                  var80 = new DualNode_Sub13_Sub3_Sub1(var71);
                                  Class3.intStack[var5++] = var80.method970(var83, var16);
                                  continue;
                                }

                                if (opcode == 4109) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  var5 -= 2;
                                  var16 = Class3.intStack[var5];
                                  var35 = Class3.intStack[var5 + 1];
                                  var71 = Class2.fontMetricsIndex.getFile(var35, 0);
                                  var80 = new DualNode_Sub13_Sub3_Sub1(var71);
                                  Class3.intStack[var5++] = var80.method969(var83, var16);
                                  continue;
                                }

                                if (opcode == 4110) {
                                  var6 -= 2;
                                  var83 = Class3.stringStack[var6];
                                  var54 = Class3.stringStack[var6 + 1];
                                  --var5;
                                  if (Class3.intStack[var5] == 1) {
                                    Class3.stringStack[var6++] = var83;
                                  } else {
                                    Class3.stringStack[var6++] = var54;
                                  }
                                  continue;
                                }

                                if (opcode == 4111) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  Class3.stringStack[var6++] = DualNode_Sub13_Sub3.appendTags(var83);
                                  continue;
                                }

                                if (opcode == 4112) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  --var5;
                                  var16 = Class3.intStack[var5];
                                  Class3.stringStack[var6++] = var83 + (char) var16;
                                  continue;
                                }

                                if (opcode == 4113) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var89 = Class3.intStack;
                                  var35 = var5++;
                                  var86 = (char) var33;
                                  if (var86 >= 32 && var86 <= 126) {
                                    var41 = true;
                                  } else if (var86 >= 160 && var86 <= 255) {
                                    var41 = true;
                                  } else if (var86 != 8364 && var86 != 338 && var86 != 8212
                                      && var86 != 339 && var86 != 376) {
                                    var41 = false;
                                  } else {
                                    var41 = true;
                                  }

                                  var89[var35] = var41 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 4114) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var89 = Class3.intStack;
                                  var35 = var5++;
                                  var86 = (char) var33;
                                  var41 = var86 >= 48 && var86 <= 57 || var86 >= 65 && var86 <= 90
                                      || var86 >= 97 && var86 <= 122;
                                  var89[var35] = var41 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 4115) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = LandscapeTile.method581((char) var33) ? 1
                                      : 0;
                                  continue;
                                }

                                if (opcode == 4116) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = MilliTimer.method553((char) var33) ? 1
                                      : 0;
                                  continue;
                                }

                                if (opcode == 4117) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (var83 != null) {
                                    Class3.intStack[var5++] = var83.length();
                                  } else {
                                    Class3.intStack[var5++] = 0;
                                  }
                                  continue;
                                }

                                if (opcode == 4118) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  var5 -= 2;
                                  var16 = Class3.intStack[var5];
                                  var35 = Class3.intStack[var5 + 1];
                                  Class3.stringStack[var6++] = var83.substring(var16, var35);
                                  continue;
                                }

                                if (opcode == 4119) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  StringBuilder var75 = new StringBuilder(var83.length());
                                  var98 = false;

                                  for (var45 = 0; var45 < var83.length(); var45++) {
                                    var86 = var83.charAt(var45);
                                    if (var86 == 60) {
                                      var98 = true;
                                    } else if (var86 == 62) {
                                      var98 = false;
                                    } else if (!var98) {
                                      var75.append(var86);
                                    }
                                  }

                                  Class3.stringStack[var6++] = var75.toString();
                                  continue;
                                }

                                if (opcode == 4120) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  --var5;
                                  var16 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = var83.indexOf(var16);
                                  continue;
                                }

                                if (opcode == 4121) {
                                  var6 -= 2;
                                  var83 = Class3.stringStack[var6];
                                  var54 = Class3.stringStack[var6 + 1];
                                  --var5;
                                  var35 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = var83.indexOf(var54, var35);
                                  continue;
                                }
                              } else if (opcode < 4300) {
                                if (opcode == 4200) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.stringStack[var6++] = FriendedPlayer.getItemType(var33).name;
                                  continue;
                                }

                                ItemType var761;
                                if (opcode == 4201) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  var761 = FriendedPlayer.getItemType(var33);
                                  if (var16 >= 1 && var16 <= 5
                                      && var761.groundActions[var16 - 1] != null) {
                                    Class3.stringStack[var6++] = var761.groundActions[var16 - 1];
                                    continue;
                                  }

                                  Class3.stringStack[var6++] = "";
                                  continue;
                                }

                                if (opcode == 4202) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  var761 = FriendedPlayer.getItemType(var33);
                                  if (var16 >= 1 && var16 <= 5 && var761.actions[var16 - 1] != null) {
                                    Class3.stringStack[var6++] = var761.actions[var16 - 1];
                                    continue;
                                  }

                                  Class3.stringStack[var6++] = "";
                                  continue;
                                }

                                if (opcode == 4203) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = FriendedPlayer
                                      .getItemType(var33).storeValue;
                                  continue;
                                }

                                if (opcode == 4204) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = FriendedPlayer
                                      .getItemType(var33).stackable == 1 ? 1 : 0;
                                  continue;
                                }

                                ItemType var84;
                                if (opcode == 4205) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var84 = FriendedPlayer.getItemType(var33);
                                  if (var84.anInt1633 == -1 && var84.anInt1640 >= 0) {
                                    Class3.intStack[var5++] = var84.anInt1640;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = var33;
                                  continue;
                                }

                                if (opcode == 4206) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  var84 = FriendedPlayer.getItemType(var33);
                                  if (var84.anInt1633 >= 0 && var84.anInt1640 >= 0) {
                                    Class3.intStack[var5++] = var84.anInt1640;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = var33;
                                  continue;
                                }

                                if (opcode == 4207) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = FriendedPlayer
                                      .getItemType(var33).aBool1618 ? 1 : 0;
                                  continue;
                                }

                                if (opcode == 4210) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  --var5;
                                  var16 = Class3.intStack[var5];
                                  var41 = var16 == 1;
                                  var93 = var83.toLowerCase();
                                  short[] var891 = new short[16];
                                  var20 = 0;
                                  var48 = 0;

                                  while (true) {
                                    if (var48 >= Class13.itemsSize) {
                                      Connection.aShortArray560 = var891;
                                      ClientSettings.anInt305 = 0;
                                      GroundItem.anInt1840 = var20;
                                      String[] var81 = new String[GroundItem.anInt1840];

                                      for (var58 = 0; var58 < GroundItem.anInt1840; var58++) {
                                        var81[var58] = FriendedPlayer
                                            .getItemType(var891[var58]).name;
                                      }

                                      Class65.method317(var81, Connection.aShortArray560);
                                      break;
                                    }

                                    ItemType var78 = FriendedPlayer.getItemType(var48);
                                    if ((!var41 || var78.aBool1624) && var78.anInt1633 == -1
                                        && var78.name.toLowerCase().indexOf(var93) != -1) {
                                      if (var20 >= 250) {
                                        GroundItem.anInt1840 = -1;
                                        Connection.aShortArray560 = null;
                                        break;
                                      }

                                      if (var20 >= var891.length) {
                                        short[] var831 = new short[var891.length * 2];

                                        for (var62 = 0; var62 < var20; var62++) {
                                          var831[var62] = var891[var62];
                                        }

                                        var891 = var831;
                                      }

                                      var891[var20++] = (short) var48;
                                    }

                                    ++var48;
                                  }

                                  Class3.intStack[var5++] = GroundItem.anInt1840;
                                  continue;
                                }

                                if (opcode == 4211) {
                                  if (Connection.aShortArray560 != null
                                      && ClientSettings.anInt305 < GroundItem.anInt1840) {
                                    Class3.intStack[var5++] = Connection.aShortArray560[++ClientSettings.anInt305
                                        - 1] & 0xffff;
                                    continue;
                                  }

                                  Class3.intStack[var5++] = -1;
                                  continue;
                                }

                                if (opcode == 4212) {
                                  ClientSettings.anInt305 = 0;
                                  continue;
                                }
                              } else if (opcode < 5100) {
                                if (opcode == 5000) {
                                  Class3.intStack[var5++] = Client.anInt2110;
                                  continue;
                                }

                                if (opcode == 5001) {
                                  var5 -= 3;
                                  Client.anInt2110 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class51[] var97 = Class41.method225(94483834);
                                  var45 = 0;

                                  Class51 var931;
                                  while (true) {
                                    if (var45 >= var97.length) {
                                      var931 = null;
                                      break;
                                    }

                                    Class51 var90 = var97[var45];
                                    if (var90.anInt525 == var16) {
                                      var931 = var90;
                                      break;
                                    }

                                    ++var45;
                                  }

                                  VarClientHub.aClass51_320 = var931;
                                  if (VarClientHub.aClass51_320 == null) {
                                    VarClientHub.aClass51_320 = Class51.aClass51_524;
                                  }

                                  Client.anInt2182 = Class3.intStack[var5 + 2];
                                  Client.outBuffer.putHeader(44);
                                  Client.outBuffer.putByte(Client.anInt2110);
                                  Client.outBuffer.putByte(VarClientHub.aClass51_320.anInt525);
                                  Client.outBuffer.putByte(Client.anInt2182);
                                  continue;
                                }

                                if (opcode == 5002) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  var5 -= 2;
                                  var16 = Class3.intStack[var5];
                                  var35 = Class3.intStack[var5 + 1];
                                  Client.outBuffer.putHeader(71);
                                  Client.outBuffer.putByte(TileDecorationStub.getLength(var83) + 2);
                                  Client.outBuffer.putString(var83);
                                  Client.outBuffer.putByte(var16 - 1);
                                  Client.outBuffer.putByte(var35);
                                  continue;
                                }

                                if (opcode == 5003) {
                                  var5 -= 2;
                                  var33 = Class3.intStack[var5];
                                  var16 = Class3.intStack[var5 + 1];
                                  Class5 var96 = (Class5) Class32.aMap359.get(Integer.valueOf(var33));
                                  DualNode_Sub8 var92 = var96.method74(var16);
                                  if (var92 != null) {
                                    Class3.intStack[var5++] = var92.anInt1516;
                                    Class3.intStack[var5++] = var92.anInt1517;
                                    Class3.stringStack[var6++] = var92.aString1521 != null
                                        ? var92.aString1521 : "";
                                    Class3.stringStack[var6++] = var92.aString1519 != null
                                        ? var92.aString1519 : "";
                                    Class3.stringStack[var6++] = var92.aString1520 != null
                                        ? var92.aString1520 : "";
                                  } else {
                                    Class3.intStack[var5++] = -1;
                                    Class3.intStack[var5++] = 0;
                                    Class3.stringStack[var6++] = "";
                                    Class3.stringStack[var6++] = "";
                                    Class3.stringStack[var6++] = "";
                                  }
                                  continue;
                                }

                                if (opcode == 5004) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  DualNode_Sub8 var95 = MouseInput.method332(var33);
                                  if (var95 != null) {
                                    Class3.intStack[var5++] = var95.anInt1518;
                                    Class3.intStack[var5++] = var95.anInt1517;
                                    Class3.stringStack[var6++] = var95.aString1521 != null
                                        ? var95.aString1521 : "";
                                    Class3.stringStack[var6++] = var95.aString1519 != null
                                        ? var95.aString1519 : "";
                                    Class3.stringStack[var6++] = var95.aString1520 != null
                                        ? var95.aString1520 : "";
                                  } else {
                                    Class3.intStack[var5++] = -1;
                                    Class3.intStack[var5++] = 0;
                                    Class3.stringStack[var6++] = "";
                                    Class3.stringStack[var6++] = "";
                                    Class3.stringStack[var6++] = "";
                                  }
                                  continue;
                                }

                                if (opcode == 5005) {
                                  if (VarClientHub.aClass51_320 == null) {
                                    Class3.intStack[var5++] = -1;
                                  } else {
                                    Class3.intStack[var5++] = VarClientHub.aClass51_320.anInt525;
                                  }
                                  continue;
                                }

                                if (opcode == 5008) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  --var5;
                                  var16 = Class3.intStack[var5];
                                  var93 = var83.toLowerCase();
                                  byte var85 = 0;
                                  if (var93.startsWith("yellow:")) {
                                    var85 = 0;
                                    var83 = var83.substring("yellow:".length());
                                  } else if (var93.startsWith("red:")) {
                                    var85 = 1;
                                    var83 = var83.substring("red:".length());
                                  } else if (var93.startsWith("green:")) {
                                    var85 = 2;
                                    var83 = var83.substring("green:".length());
                                  } else if (var93.startsWith("cyan:")) {
                                    var85 = 3;
                                    var83 = var83.substring("cyan:".length());
                                  } else if (var93.startsWith("purple:")) {
                                    var85 = 4;
                                    var83 = var83.substring("purple:".length());
                                  } else if (var93.startsWith("white:")) {
                                    var85 = 5;
                                    var83 = var83.substring("white:".length());
                                  } else if (var93.startsWith("flash1:")) {
                                    var85 = 6;
                                    var83 = var83.substring("flash1:".length());
                                  } else if (var93.startsWith("flash2:")) {
                                    var85 = 7;
                                    var83 = var83.substring("flash2:".length());
                                  } else if (var93.startsWith("flash3:")) {
                                    var85 = 8;
                                    var83 = var83.substring("flash3:".length());
                                  } else if (var93.startsWith("glow1:")) {
                                    var85 = 9;
                                    var83 = var83.substring("glow1:".length());
                                  } else if (var93.startsWith("glow2:")) {
                                    var85 = 10;
                                    var83 = var83.substring("glow2:".length());
                                  } else if (var93.startsWith("glow3:")) {
                                    var85 = 11;
                                    var83 = var83.substring("glow3:".length());
                                  } else if (Client.languageId != 0) {
                                    if (var93.startsWith("yellow:")) {
                                      var85 = 0;
                                      var83 = var83.substring("yellow:".length());
                                    } else if (var93.startsWith("red:")) {
                                      var85 = 1;
                                      var83 = var83.substring("red:".length());
                                    } else if (var93.startsWith("green:")) {
                                      var85 = 2;
                                      var83 = var83.substring("green:".length());
                                    } else if (var93.startsWith("cyan:")) {
                                      var85 = 3;
                                      var83 = var83.substring("cyan:".length());
                                    } else if (var93.startsWith("purple:")) {
                                      var85 = 4;
                                      var83 = var83.substring("purple:".length());
                                    } else if (var93.startsWith("white:")) {
                                      var85 = 5;
                                      var83 = var83.substring("white:".length());
                                    } else if (var93.startsWith("flash1:")) {
                                      var85 = 6;
                                      var83 = var83.substring("flash1:".length());
                                    } else if (var93.startsWith("flash2:")) {
                                      var85 = 7;
                                      var83 = var83.substring("flash2:".length());
                                    } else if (var93.startsWith("flash3:")) {
                                      var85 = 8;
                                      var83 = var83.substring("flash3:".length());
                                    } else if (var93.startsWith("glow1:")) {
                                      var85 = 9;
                                      var83 = var83.substring("glow1:".length());
                                    } else if (var93.startsWith("glow2:")) {
                                      var85 = 10;
                                      var83 = var83.substring("glow2:".length());
                                    } else if (var93.startsWith("glow3:")) {
                                      var85 = 11;
                                      var83 = var83.substring("glow3:".length());
                                    }
                                  }

                                  var93 = var83.toLowerCase();
                                  byte var88 = 0;
                                  if (var93.startsWith("wave:")) {
                                    var88 = 1;
                                    var83 = var83.substring("wave:".length());
                                  } else if (var93.startsWith("wave2:")) {
                                    var88 = 2;
                                    var83 = var83.substring("wave2:".length());
                                  } else if (var93.startsWith("shake:")) {
                                    var88 = 3;
                                    var83 = var83.substring("shake:".length());
                                  } else if (var93.startsWith("scroll:")) {
                                    var88 = 4;
                                    var83 = var83.substring("scroll:".length());
                                  } else if (var93.startsWith("slide:")) {
                                    var88 = 5;
                                    var83 = var83.substring("slide:".length());
                                  } else if (Client.languageId != 0) {
                                    if (var93.startsWith("wave:")) {
                                      var88 = 1;
                                      var83 = var83.substring("wave:".length());
                                    } else if (var93.startsWith("wave2:")) {
                                      var88 = 2;
                                      var83 = var83.substring("wave2:".length());
                                    } else if (var93.startsWith("shake:")) {
                                      var88 = 3;
                                      var83 = var83.substring("shake:".length());
                                    } else if (var93.startsWith("scroll:")) {
                                      var88 = 4;
                                      var83 = var83.substring("scroll:".length());
                                    } else if (var93.startsWith("slide:")) {
                                      var88 = 5;
                                      var83 = var83.substring("slide:".length());
                                    }
                                  }

                                  Client.outBuffer.putHeader(87);
                                  Client.outBuffer.putByte(0);
                                  var20 = Client.outBuffer.position;
                                  Client.outBuffer.putByte(var16);
                                  Client.outBuffer.putByte(var85);
                                  Client.outBuffer.putByte(var88);
                                  Client.method1056(Client.outBuffer, var83);
                                  Client.outBuffer.putVarByte(Client.outBuffer.position - var20);
                                  continue;
                                }

                                if (opcode == 5009) {
                                  var6 -= 2;
                                  var83 = Class3.stringStack[var6];
                                  var54 = Class3.stringStack[var6 + 1];
                                  Client.outBuffer.putHeader(248);
                                  Client.outBuffer.putShort(0);
                                  var35 = Client.outBuffer.position;
                                  Client.outBuffer.putString(var83);
                                  BitBuf var82 = Client.outBuffer;
                                  var49 = var82.position;
                                  byte[] var87 = Class53.method273(var54);
                                  var82.putUSmart(var87.length);
                                  var82.position += Class120.huffman.compress(var87, 0, var87.length,
                                      var82.payload, var82.position);
                                  Client.outBuffer.putVarShort(Client.outBuffer.position - var35);
                                  continue;
                                }

                                if (opcode == 5015) {
                                  if (Class68.myPlayer != null && Class68.myPlayer.name != null) {
                                    var83 = Class68.myPlayer.name;
                                  } else {
                                    var83 = "";
                                  }

                                  Class3.stringStack[var6++] = var83;
                                  continue;
                                }

                                if (opcode == 5016) {
                                  Class3.intStack[var5++] = Client.anInt2182;
                                  continue;
                                }

                                if (opcode == 5017) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = DualNode_Sub14.method822(var33);
                                  continue;
                                }

                                if (opcode == 5018) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Class91.method403(var33);
                                  continue;
                                }

                                if (opcode == 5019) {
                                  --var5;
                                  var33 = Class3.intStack[var5];
                                  Class3.intStack[var5++] = Class21.method157(var33);
                                  continue;
                                }

                                if (opcode == 5020) {
                                  --var6;
                                  var83 = Class3.stringStack[var6];
                                  if (var83.equalsIgnoreCase("toggleroof")) {
                                    AnimationSkin.settings.hideRoofs = !AnimationSkin.settings.hideRoofs;
                                    Class75.serializeSettings();
                                    if (AnimationSkin.settings.hideRoofs) {
                                      Class75.method334(99, "", "Roofs are now all hidden");
                                    } else {
                                      Class75.method334(99, "",
                                          "Roofs will only be removed selectively");
                                    }
                                  }

                                  if (var83.equalsIgnoreCase("displayfps")) {
                                    Client.displayFps = !Client.displayFps;
                                  }

                                  if (Client.myRights >= 2) {
                                    if (var83.equalsIgnoreCase("fpson")) {
                                      Client.displayFps = true;
                                    }

                                    if (var83.equalsIgnoreCase("fpsoff")) {
                                      Client.displayFps = false;
                                    }

                                    if (var83.equalsIgnoreCase("gc")) {
                                      System.gc();
                                    }

                                    if (var83.equalsIgnoreCase("clientdrop")) {
                                      Class81.method361();
                                    }

                                    if (var83.equalsIgnoreCase("errortest")
                                        && Client.socketType == 2) {
                                      throw new RuntimeException();
                                    }
                                  }

                                  Client.outBuffer.putHeader(78);
                                  Client.outBuffer.putByte(var83.length() + 1);
                                  Client.outBuffer.putString(var83);
                                  continue;
                                }

                                if (opcode == 5021) {
                                  --var6;
                                  Client.aString2044 = Class3.stringStack[var6].toLowerCase().trim();
                                  continue;
                                }

                                if (opcode == 5022) {
                                  Class3.stringStack[var6++] = Client.aString2044;
                                  continue;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var16 = -1;
                        if (opcode >= 2000) {
                          opcode -= 1000;
                          --var5;
                          var16 = Class3.intStack[var5];
                          var15 = Class94.getWidget(var16);
                        } else {
                          var15 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                        }

                        if (opcode == 1100) {
                          var5 -= 2;
                          var15.insetX = Class3.intStack[var5];
                          if (var15.insetX > var15.viewportWidth - var15.width) {
                            var15.insetX = var15.viewportWidth - var15.width;
                          }

                          if (var15.insetX < 0) {
                            var15.insetX = 0;
                          }

                          var15.insetY = Class3.intStack[var5 + 1];
                          if (var15.insetY > var15.viewportHeight - var15.height * 1227800423) {
                            var15.insetY = var15.viewportHeight - var15.height * 1227800423;
                          }

                          if (var15.insetY < 0) {
                            var15.insetY = 0;
                          }

                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1101) {
                          --var5;
                          var15.textColor = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1102) {
                          --var5;
                          var15.aBool1161 = Class3.intStack[var5] == 1;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1103) {
                          --var5;
                          var15.alpha = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1104) {
                          --var5;
                          var15.anInt1137 = Class3.intStack[var5] * -532092193;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1105) {
                          --var5;
                          var15.textureId = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1106) {
                          --var5;
                          var15.spriteId = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1107) {
                          --var5;
                          var15.aBool1144 = Class3.intStack[var5] == 1;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1108) {
                          var15.modelType = 1;
                          --var5;
                          var15.modelId = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1109) {
                          var5 -= 6;
                          var15.anInt1198 = Class3.intStack[var5];
                          var15.anInt1151 = Class3.intStack[var5 + 1];
                          var15.rotationX = Class3.intStack[var5 + 2];
                          var15.rotationZ = Class3.intStack[var5 + 3];
                          var15.rotationY = Class3.intStack[var5 + 4];
                          var15.modelZoom = Class3.intStack[var5 + 5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1110) {
                          --var5;
                          var35 = Class3.intStack[var5];
                          if (var15.anInt1162 != var35) {
                            var15.anInt1162 = var35;
                            var15.anInt1194 = 0;
                            var15.anInt1126 = 0;
                            Class68.method326(var15);
                          }
                          continue;
                        }

                        if (opcode == 1111) {
                          --var5;
                          var15.aBool1154 = Class3.intStack[var5] == 1;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1112) {
                          --var6;
                          var93 = Class3.stringStack[var6];
                          if (!var93.equals(var15.text)) {
                            var15.text = var93;
                            Class68.method326(var15);
                          }
                          continue;
                        }

                        if (opcode == 1113) {
                          --var5;
                          var15.fontId = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1114) {
                          var5 -= 3;
                          var15.anInt1159 = Class3.intStack[var5];
                          var15.anInt1138 = Class3.intStack[var5 + 1];
                          var15.anInt1158 = Class3.intStack[var5 + 2];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1115) {
                          --var5;
                          var15.textShadowed = Class3.intStack[var5] == 1;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1116) {
                          --var5;
                          var15.borderThickness = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1117) {
                          --var5;
                          var15.shadowColor = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1118) {
                          --var5;
                          var15.flippedVertically = Class3.intStack[var5] == 1;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1119) {
                          --var5;
                          var15.flippedHorizontally = Class3.intStack[var5] == 1;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1120) {
                          var5 -= 2;
                          var15.viewportWidth = Class3.intStack[var5];
                          var15.viewportHeight = Class3.intStack[var5 + 1];
                          Class68.method326(var15);
                          if (var16 != -1 && var15.type == 0) {
                            ObjectType.method870(Widget.interfaces[var16 >> 16], var15, false);
                          }
                          continue;
                        }

                        if (opcode == 1121) {
                          FriendedPlayer.method410(var15.hash, var15.index);
                          Client.aWidget2135 = var15;
                          Class68.method326(var15);
                          continue;
                        }

                        if (opcode == 1122) {
                          --var5;
                          var15.anInt1143 = Class3.intStack[var5];
                          Class68.method326(var15);
                          continue;
                        }
                      }
                    } else {
                      var33 = -1;
                      if (opcode >= 2000) {
                        opcode -= 1000;
                        --var5;
                        var33 = Class3.intStack[var5];
                        var34 = Class94.getWidget(var33);
                      } else {
                        var34 = var46 ? ClientSettings.aWidget304 : Class3.aWidget88;
                      }

                      if (opcode == 1000) {
                        var5 -= 4;
                        var34.anInt1134 = Class3.intStack[var5] * 10986657;
                        var34.anInt1185 = Class3.intStack[var5 + 1] * -720369495;
                        var34.anInt1132 = Class3.intStack[var5 + 2];
                        var34.anInt1122 = Class3.intStack[var5 + 3];
                        Class68.method326(var34);
                        Player.method1048(var34);
                        if (var33 != -1 && var34.type == 0) {
                          ObjectType.method870(Widget.interfaces[var33 >> 16], var34, false);
                        }
                        continue;
                      }

                      if (opcode == 1001) {
                        var5 -= 4;
                        var34.anInt1135 = Class3.intStack[var5] * 934649725;
                        var34.anInt1136 = Class3.intStack[var5 + 1] * -280898437;
                        var34.anInt1133 = Class3.intStack[var5 + 2];
                        var34.buttonType = Class3.intStack[var5 + 3];
                        Class68.method326(var34);
                        Player.method1048(var34);
                        if (var33 != -1 && var34.type == 0) {
                          ObjectType.method870(Widget.interfaces[var33 >> 16], var34, false);
                        }
                        continue;
                      }

                      if (opcode == 1003) {
                        --var5;
                        var98 = Class3.intStack[var5] == 1;
                        if (var34.hidden != var98) {
                          var34.hidden = var98;
                          Class68.method326(var34);
                        }
                        continue;
                      }

                      if (opcode == 1005) {
                        --var5;
                        var34.aBool1201 = Class3.intStack[var5] == 1;
                        continue;
                      }

                      if (opcode == 1006) {
                        --var5;
                        var34.aBool1175 = Class3.intStack[var5] == 1;
                        continue;
                      }
                    }
                  }

                  if (opcode < 5400) {
                    if (opcode == 5306) {
                      int[] var541 = Class3.intStack;
                      var16 = var5++;
                      var35 = Client.resizable ? 2 : 1;
                      var541[var16] = var35;
                      continue;
                    }

                    if (opcode == 5307) {
                      --var5;
                      var33 = Class3.intStack[var5];
                      if (var33 != 1 && var33 != 2) {
                        continue;
                      }

                      Client.aLong2035 = 0L;
                      if (var33 >= 2) {
                        Client.resizable = true;
                      } else {
                        Client.resizable = false;
                      }

                      AnimationSkin.method534();
                      if (Client.anInt2113 >= 25) {
                        Client.outBuffer.putHeader(23);
                        BitBuf var52 = Client.outBuffer;
                        var35 = Client.resizable ? 2 : 1;
                        var52.putByte(var35);
                        Client.outBuffer.putShort(Class34.gameWidth);
                        Client.outBuffer.putShort(Node_Sub9.gameHeight);
                      }

                      GameEngine.aBool1979 = true;
                      continue;
                    }

                    if (opcode == 5308) {
                      Class3.intStack[var5++] = AnimationSkin.settings.screenType;
                      continue;
                    }

                    if (opcode == 5309) {
                      --var5;
                      var33 = Class3.intStack[var5];
                      if (var33 == 1 || var33 == 2) {
                        AnimationSkin.settings.screenType = var33;
                        Class75.serializeSettings();
                      }
                      continue;
                    }
                  }

                  if (opcode < 5600) {
                    if (opcode == 5504) {
                      var5 -= 2;
                      var33 = Class3.intStack[var5];
                      var16 = Class3.intStack[var5 + 1];
                      if (!Client.aBool2046) {
                        Client.anInt2051 = var33;
                        Client.minimapRotation = var16;
                      }
                      continue;
                    }

                    if (opcode == 5505) {
                      Class3.intStack[var5++] = Client.anInt2051;
                      continue;
                    }

                    if (opcode == 5506) {
                      Class3.intStack[var5++] = Client.minimapRotation;
                      continue;
                    }

                    if (opcode == 5530) {
                      --var5;
                      var33 = Class3.intStack[var5];
                      if (var33 < 0) {
                        var33 = 0;
                      }

                      Client.anInt2185 = var33;
                      continue;
                    }

                    if (opcode == 5531) {
                      Class3.intStack[var5++] = Client.anInt2185;
                      continue;
                    }
                  }

                  if (opcode < 5700 && opcode == 5630) {
                    Client.anInt2045 = 250;
                  } else {
                    if (opcode < 6300) {
                      if (opcode == 6200) {
                        var5 -= 2;
                        Client.aShort2178 = (short) Class3.intStack[var5];
                        if (Client.aShort2178 <= 0) {
                          Client.aShort2178 = 256;
                        }

                        Client.aShort2217 = (short) Class3.intStack[var5 + 1];
                        if (Client.aShort2217 <= 0) {
                          Client.aShort2217 = 205;
                        }
                        continue;
                      }

                      if (opcode == 6201) {
                        var5 -= 2;
                        Client.aShort2218 = (short) Class3.intStack[var5];
                        if (Client.aShort2218 <= 0) {
                          Client.aShort2218 = 256;
                        }

                        Client.aShort2014 = (short) Class3.intStack[var5 + 1];
                        if (Client.aShort2014 <= 0) {
                          Client.aShort2014 = 320;
                        }
                        continue;
                      }

                      if (opcode == 6202) {
                        var5 -= 4;
                        Client.aShort2219 = (short) Class3.intStack[var5];
                        if (Client.aShort2219 <= 0) {
                          Client.aShort2219 = 1;
                        }

                        Client.aShort2125 = (short) Class3.intStack[var5 + 1];
                        if (Client.aShort2125 <= 0) {
                          Client.aShort2125 = 32767;
                        } else if (Client.aShort2125 < Client.aShort2219) {
                          Client.aShort2125 = Client.aShort2219;
                        }

                        Client.aShort2221 = (short) Class3.intStack[var5 + 2];
                        if (Client.aShort2221 <= 0) {
                          Client.aShort2221 = 1;
                        }

                        Client.aShort2222 = (short) Class3.intStack[var5 + 3];
                        if (Client.aShort2222 <= 0) {
                          Client.aShort2222 = 32767;
                        } else if (Client.aShort2222 < Client.aShort2221) {
                          Client.aShort2222 = Client.aShort2221;
                        }
                        continue;
                      }

                      if (opcode == 6203) {
                        if (Client.aWidget2231 != null) {
                          Class13.method118(0, 0, Client.aWidget2231.width,
                              Client.aWidget2231.height * 1227800423, false);
                          Class3.intStack[var5++] = Client.screenHeight;
                          Class3.intStack[var5++] = Client.screenWidth;
                        } else {
                          Class3.intStack[var5++] = -1;
                          Class3.intStack[var5++] = -1;
                        }
                        continue;
                      }

                      if (opcode == 6204) {
                        Class3.intStack[var5++] = Client.aShort2218;
                        Class3.intStack[var5++] = Client.aShort2014;
                        continue;
                      }

                      if (opcode == 6205) {
                        Class3.intStack[var5++] = Client.aShort2178;
                        Class3.intStack[var5++] = Client.aShort2217;
                        continue;
                      }
                    }

                    if (opcode < 6600) {
                      if (opcode == 6500) {
                        Class3.intStack[var5++] = Class30.loadWorlds() ? 1 : 0;
                        continue;
                      }

                      World var51;
                      if (opcode == 6501) {
                        var51 = Npc.method1026((byte) 2);
                        if (var51 != null) {
                          Class3.intStack[var5++] = var51.id;
                          Class3.intStack[var5++] = var51.flags;
                          Class3.stringStack[var6++] = var51.activity;
                          Class3.intStack[var5++] = var51.location;
                          Class3.intStack[var5++] = var51.population;
                          Class3.stringStack[var6++] = var51.domain;
                        } else {
                          Class3.intStack[var5++] = -1;
                          Class3.intStack[var5++] = 0;
                          Class3.stringStack[var6++] = "";
                          Class3.intStack[var5++] = 0;
                          Class3.intStack[var5++] = 0;
                          Class3.stringStack[var6++] = "";
                        }
                        continue;
                      }

                      if (opcode == 6502) {
                        if (World.anInt1121 < World.worldCount) {
                          var51 = World.worlds[++World.anInt1121 - 1];
                        } else {
                          var51 = null;
                        }

                        if (var51 != null) {
                          Class3.intStack[var5++] = var51.id;
                          Class3.intStack[var5++] = var51.flags;
                          Class3.stringStack[var6++] = var51.activity;
                          Class3.intStack[var5++] = var51.location;
                          Class3.intStack[var5++] = var51.population;
                          Class3.stringStack[var6++] = var51.domain;
                        } else {
                          Class3.intStack[var5++] = -1;
                          Class3.intStack[var5++] = 0;
                          Class3.stringStack[var6++] = "";
                          Class3.intStack[var5++] = 0;
                          Class3.intStack[var5++] = 0;
                          Class3.stringStack[var6++] = "";
                        }
                        continue;
                      }

                      World var53;
                      if (opcode == 6506) {
                        --var5;
                        var33 = Class3.intStack[var5];
                        var53 = null;

                        for (var35 = 0; var35 < World.worldCount; var35++) {
                          if (World.worlds[var35].id == var33) {
                            var53 = World.worlds[var35];
                            break;
                          }
                        }

                        if (var53 != null) {
                          Class3.intStack[var5++] = var53.id;
                          Class3.intStack[var5++] = var53.flags;
                          Class3.stringStack[var6++] = var53.activity;
                          Class3.intStack[var5++] = var53.location;
                          Class3.intStack[var5++] = var53.population;
                          Class3.stringStack[var6++] = var53.domain;
                        } else {
                          Class3.intStack[var5++] = -1;
                          Class3.intStack[var5++] = 0;
                          Class3.stringStack[var6++] = "";
                          Class3.intStack[var5++] = 0;
                          Class3.intStack[var5++] = 0;
                          Class3.stringStack[var6++] = "";
                        }
                        continue;
                      }

                      if (opcode == 6507) {
                        var5 -= 4;
                        var33 = Class3.intStack[var5];
                        var55 = Class3.intStack[var5 + 1] == 1;
                        var35 = Class3.intStack[var5 + 2];
                        var41 = Class3.intStack[var5 + 3] == 1;
                        if (World.worlds != null) {
                          Class37.method210(0, World.worlds.length - 1, var33, var55, var35, var41);
                        }
                        continue;
                      }

                      if (opcode == 6511) {
                        --var5;
                        var33 = Class3.intStack[var5];
                        if (var33 >= 0 && var33 < World.worldCount) {
                          var53 = World.worlds[var33];
                          Class3.intStack[var5++] = var53.id;
                          Class3.intStack[var5++] = var53.flags;
                          Class3.stringStack[var6++] = var53.activity;
                          Class3.intStack[var5++] = var53.location;
                          Class3.intStack[var5++] = var53.population;
                          Class3.stringStack[var6++] = var53.domain;
                          continue;
                        }

                        Class3.intStack[var5++] = -1;
                        Class3.intStack[var5++] = 0;
                        Class3.stringStack[var6++] = "";
                        Class3.intStack[var5++] = 0;
                        Class3.intStack[var5++] = 0;
                        Class3.stringStack[var6++] = "";
                        continue;
                      }
                    }

                    throw new IllegalStateException();
                  }
                }
              } catch (Exception var461) {
                StringBuilder builder = new StringBuilder(30);
                builder.append("").append(script.key).append(" ");

                for (index = Class3.anInt87 - 1; index >= 0; --index) {
                  builder.append("").append(Class3.aClass33Array86[index].aRuneScript361.key).append(" ");
                }

                builder.append("").append(-1);
                Class79.error(builder.toString(), var461);
              }
            }

          }

}
