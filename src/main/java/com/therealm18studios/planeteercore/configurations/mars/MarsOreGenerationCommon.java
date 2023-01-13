package com.therealm18studios.planeteercore.configurations.mars;

import net.minecraftforge.common.ForgeConfigSpec;

public class MarsOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOPPERHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSZINCHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOBALTHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOALHEIGHTTOP;


    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOPPERHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSZINCHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOBALTHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOALHEIGHTBOTTOM;


    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOPPERVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSZINCVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOBALTVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOALVEIN;




    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Mars Ore Config");

        //Mars Copper Ores
        BUILDER.push("Beyond Planets Core - Mars Copper Ore Config");
        MARSCOPPERHEIGHTTOP = BUILDER.comment("Should Mars Copper Ore Height Top.\nDefault = 32 (number)").define("Mars Copper Ore Height Top", 32);
        MARSCOPPERHEIGHTBOTTOM = BUILDER.comment("Should Mars Copper Ore Height Bottom.\nDefault = -32 (number)").define("Mars Copper Ore Height Bottom", -32);
        MARSCOPPERVEIN = BUILDER.comment("Should Mars Copper Ore Vein Size.\nDefault = 8 (number)").define("Mars Copper Ore Vein Size", 8);
        BUILDER.pop();

        //Mars Lead Ores
        BUILDER.push("Beyond Planets Core - Mars Lead Ore Config");
        MARSLEADHEIGHTTOP = BUILDER.comment("Should Mars Lead Height Top.\nDefault = 56 (number)").define("Mars Lead Ore Height Top", 56);
        MARSLEADHEIGHTBOTTOM = BUILDER.comment("Should Mars Lead Height Bottom.\nDefault = -34 (number)").define("Mars Lead Ore Height Bottom", -24);
        MARSLEADVEIN = BUILDER.comment("Should Mars Lead Ore Vein Size.\nDefault = 8 (number)").define("Mars Lead Ore Vein Size", 10);
        BUILDER.pop();

        //Mars Tin Ores
        BUILDER.push("Beyond Planets Core - Mars Tin Ore Config");
        MARSTINHEIGHTTOP = BUILDER.comment("Should Mars Tin Height Top.\nDefault = 80 (number)").define("Mars Tin Ore Height Top", 80);
        MARSTINHEIGHTBOTTOM = BUILDER.comment("Should Mars Tin Ore Height Bottom.\nDefault = -80 (number)").define("Mars Tin Ore Height Bottom", -80);
        MARSTINVEIN = BUILDER.comment("Should Mars Tin Ore Vein Size.\nDefault = 8 (number)").define("Mars Tin Ore Vein Size", 7);
        BUILDER.pop();

        //Mars Uranium Ores
        BUILDER.push("Beyond Planets Core - Mars Uranium Ore Config");
        MARSURANIUMHEIGHTTOP = BUILDER.comment("Should Mars Uranium Height Top.\nDefault = 80 (number)").define("Mars Uranium Ore Height Top", 80);
        MARSURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Mars Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Mars Uranium Ore Height Bottom", -80);
        MARSURANIUMVEIN = BUILDER.comment("Should Mars Uranium Ore Vein Size.\nDefault = 8 (number)").define("Mars Uranium Ore Vein Size", 6);
        BUILDER.pop();

        //Mars Zinc Ores
        BUILDER.push("Beyond Planets Core - Mars Zinc Ore Config");
        MARSZINCHEIGHTTOP = BUILDER.comment("Should Mars Zinc Ore spawn.\nDefault = 80 (number)").define("Mars Zinc Ore Height Top", 80);
        MARSZINCHEIGHTBOTTOM = BUILDER.comment("Should Mars Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Mars Zinc Ore Height Bottom", -80);
        MARSZINCVEIN = BUILDER.comment("Should Mars Zinc Ore Vein Size.\nDefault = 8 (number)").define("Mars Zinc Ore Vein Size", 6);
        BUILDER.pop();

        //Mars Cobalt Ores
        BUILDER.push("Beyond Planets Core - Mars Cobalt Ore Config");
        MARSCOBALTHEIGHTTOP = BUILDER.comment("Should Mars Cobalt Ore spawn.\nDefault = 80 (number)").define("Mars Cobalt Ore Height Top", 80);
        MARSCOBALTHEIGHTBOTTOM = BUILDER.comment("Should Mars Cobalt Ore Height Bottom.\nDefault = -80 (number)").define("Mars Cobalt Ore Height Bottom", -80);
        MARSCOBALTVEIN = BUILDER.comment("Should Mars Cobalt Ore Vein Size.\nDefault = 8 (number)").define("Mars Cobalt Ore Vein Size", 6);
        BUILDER.pop();

        //Mars Coal Ores
        BUILDER.push("Beyond Planets Core - Mars Coal Ore Config");
        MARSCOALHEIGHTTOP = BUILDER.comment("Should Mars Coal Ore spawn.\nDefault = 80 (number)").define("Mars Coal Ore Height Top", 80);
        MARSCOALHEIGHTBOTTOM = BUILDER.comment("Should Mars Coal Ore Height Bottom.\nDefault = -80 (number)").define("Mars Coal Ore Height Bottom", -80);
        MARSCOALVEIN = BUILDER.comment("Should Mars Coal Ore Vein Size.\nDefault = 8 (number)").define("Mars Coal Ore Vein Size", 6);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}