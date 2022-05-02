package com.zhaojj11.plugins.enums;

import com.zhaojj11.plugins.constant.EmojiTypeConstant;

public enum EmojiEnum {

     ART(EmojiTypeConstant.ART, "Improve structure / format of the code."),
    ZAP(EmojiTypeConstant.FIRE, "Improve performance."),
    FIRE(EmojiTypeConstant.FIRE, "Remove code or files."),
    BUG(EmojiTypeConstant.BUG, "Fix a bug."),
    AMBULANCE(EmojiTypeConstant.AMBULANCE, "Critical hotfix."),
    SPARKLES(EmojiTypeConstant.SPARKLES, "Introduce new features."),
    MEMO(EmojiTypeConstant.MEMO, "Add or update documentation."),
    ROCKET(EmojiTypeConstant.ROCKET, "Deploy stuff."),
    LIPSTICK(EmojiTypeConstant.LIPSTICK, "Add or update the UI and style files."),
    TADA(EmojiTypeConstant.TADA, "Begin a project."),
    WHITE_CHECK_MARK(EmojiTypeConstant.WHITE_CHECK_MARK, "Add, update, or pass tests."),
    LOCK(EmojiTypeConstant.LOCK, "Fix security issues."),
    CLOSED_LOCK_WITH_KEY(EmojiTypeConstant.CLOSED_LOCK_WITH_KEY, "Add or update secrets."),
    BOOKMARK(EmojiTypeConstant.BOOKMARK, "Release / Version tags."),
    ROTATING_LIGHT(EmojiTypeConstant.ROTATING_LIGHT, "Fix compiler / linter warnings."),
    CONSTRUCTION(EmojiTypeConstant.CONSTRUCTION, "Work in progress."),
    GREEN_HEART(EmojiTypeConstant.GREEN_HEART, "Fix CI Build."),
    ARROW_DOWN(EmojiTypeConstant.ARROW_DOWN, "Downgrade dependencies."),
    ARROW_UP(EmojiTypeConstant.ARROW_UP, "Upgrade dependencies."),
    PUSHPIN(EmojiTypeConstant.PUSHPIN, "Pin dependencies to specific versions."),
    CONSTRUCTION_WORK(EmojiTypeConstant.CONSTRUCTION_WORK, "Add or update CI build system."),
    CHART_WITH_UPWARDS_TREND(EmojiTypeConstant.CHART_WITH_UPWARDS_TREND, "Add or update analytics or track code."),
    RECYCLE(EmojiTypeConstant.RECYCLE, "Refactor code."),
    HEAVY_PLUS_SIGN(EmojiTypeConstant.HEAVY_PLUS_SIGN, "Add a dependency."),
    HEAVY_MINUS_SIGN(EmojiTypeConstant.HEAVY_MINUS_SIGN, "Remove a dependency."),
    WRENCH(EmojiTypeConstant.WRENCH, "Add or update configuration files."),
    HAMMER(EmojiTypeConstant.HAMMER, "Add or update development scripts."),
    GLOBE_WITH_MERIDIANS(EmojiTypeConstant.GLOBE_WITH_MERIDIANS, "Internationalization and localization."),
    PENCIL2(EmojiTypeConstant.PENCIL2, "Fix typos."),
    POOP(EmojiTypeConstant.POOP, "Write bad code that needs to be improved."),
    REWIND(EmojiTypeConstant.REWIND, "Revert changes."),
    TWISTED_RIGHTWARDS_ARROWS(EmojiTypeConstant.TWISTED_RIGHTWARDS_ARROWS, "Merge branches."),
    PACKAGE(EmojiTypeConstant.PACKAGE, "Add or update compiled files or packages."),
    ALIEN(EmojiTypeConstant.ALIEN, "Update code due to external API changes."),
    TRUCK(EmojiTypeConstant.TRUCK, "Move or rename resources (e.g.: files, paths, routes)."),
    PAGE_FACING_UP(EmojiTypeConstant.PAGE_FACING_UP, "Add or update license."),
    BOOM(EmojiTypeConstant.BOOM, "Introduce breaking changes."),
    BENTO(EmojiTypeConstant.BENTO, "Add or update assets."),
    WHEELCHAIR(EmojiTypeConstant.WHEELCHAIR, "Improve accessibility."),
    BULB(EmojiTypeConstant.BULB, "Add or update comments in source code."),
    BEERS(EmojiTypeConstant.BEERS, "Write code drunkenly."),
    SPEECH_BALLOON(EmojiTypeConstant.SPEECH_BALLOON, "Add or update text and literals."),
    CARD_FILE_BOX(EmojiTypeConstant.CARD_FILE_BOX, "Perform database related changes."),
    LOUD_SOUND(EmojiTypeConstant.LOUD_SOUND, "Add or update logs."),
    MUTE(EmojiTypeConstant.MUTE, "Remove logs."),
    BUSTS_IN_SILHOUETTE(EmojiTypeConstant.BUSTS_IN_SILHOUETTE, "Add or update contributor(s)."),
    CHILDREN_CROSSING(EmojiTypeConstant.CHILDREN_CROSSING, "Improve user experience / usability."),
    BUILDING_CONSTRUCTION(EmojiTypeConstant.BUILDING_CONSTRUCTION, "Make architectural changes."),
    IPHONE(EmojiTypeConstant.IPHONE, "Work on responsive design."),
    CLOWN_FACE(EmojiTypeConstant.CLOWN_FACE, "Mock things."),
    EGG(EmojiTypeConstant.EGG, "Add or update an easter egg."),
    SEE_NO_EVIL(EmojiTypeConstant.SEE_NO_EVIL, "Add or update a .gitignore file."),
    CAMERA_FLASH(EmojiTypeConstant.CAMERA_FLASH, "Add or update snapshots."),
    ALEMBIC(EmojiTypeConstant.ALEMBIC, "Perform experiments."),
    MAG(EmojiTypeConstant.MAG, "Improve SEO."),
    LABEL(EmojiTypeConstant.LABEL, "Add or update types."),
    SEEDLING(EmojiTypeConstant.SEEDLING, "Add or update seed files."),
    TRIANGULAR_FLAG_ON_POST(EmojiTypeConstant.TRIANGULAR_FLAG_ON_POST, "Add, update, or remove feature flags."),
    GOAL_NET(EmojiTypeConstant.GOAL_NET, "Catch errors."),
    DIZZY(EmojiTypeConstant.DIZZY, "Add or update animations and transitions."),
    WASTEBASKET(EmojiTypeConstant.WASTEBASKET, "Deprecate code that needs to be cleaned up."),
    PASSPORT_CONTROL(EmojiTypeConstant.PASSPORT_CONTROL, "Work on code related to authorization, roles and permissions."),
    ADHESIVE_BANDAGE(EmojiTypeConstant.ADHESIVE_BANDAGE, "Simple fix for a non-critical issue."),
    MONOCLE_FACE(EmojiTypeConstant.MONOCLE_FACE, "exploration/inspection."),
    COFFIN(EmojiTypeConstant.COFFIN, "Remove dead code."),
    TEST_TUBE(EmojiTypeConstant.TEST_TUBE, "Add a failing test."),
    NECKTIE(EmojiTypeConstant.NECKTIE, "Add or update business logic"),
    STETHOSCOPE(EmojiTypeConstant.STETHOSCOPE, "Add or update healthcheck."),
    BRICKS(EmojiTypeConstant.BRICKS, "Infrastructure related changes."),
    TECHNOLOGIST(EmojiTypeConstant.TECHNOLOGIST, "Improve developer experience")
    ;

    private final String emoji;
    private final String description;

    EmojiEnum(String emoji, String description) {
        this.emoji = emoji;
        this.description = description;
    }

    public String getEmoji() {
        return emoji;
    }

    public  String getEmojiMessage(){
        return String.format(":%s:", emoji);
    }

    public String getDescription() {
        return description;
    }
}
