// Copyright (c) Facebook, Inc. and its affiliates.

// This source code is licensed under the MIT license found in the
// LICENSE file in the root directory of this source tree.

buildscript {
    repositories {
        mavenLocal()
        google()
        jcenter()
    }
    dependencies {
<<<<<<< HEAD:build.gradle
        classpath("com.android.tools.build:gradle:3.3.1")
=======
        classpath("com.android.tools.build:gradle:3.4.1")
>>>>>>> v0.60.0:build.gradle.kts
        classpath("de.undercouch:gradle-download-task:3.4.3")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

def isSDXPlatform() {
    if (parent == null) {
        return false;
    }

    return true;
}

allprojects {
    repositories {
        maven {
            url = uri("$rootDir/node_modules/jsc-android/dist")
        }
        mavenLocal()
        google()
        jcenter()
    }
}