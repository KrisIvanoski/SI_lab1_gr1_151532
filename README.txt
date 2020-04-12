git clone https://github.com/finkiSI/SI_lab1_gr1 -- cloning repo od labot
git remote rm origin - removing link so repoto od labot 
git remote add origin https://github.com/KrisIvanoski/SI_lab1_gr1_151532.git - kreiranje na repo na git i linkuvanje 
q7: git remote add upstream https://github.com/opencart/opencart.git - seuste ne mi e jasno zosto moram ova da go pravam no najv e zaradi tracking :)
q7: git checkout master - stavanje master da mi e aktiven 
q8: git add students.csv - dodavanje na students.csv
q9: git commit -m "students.csv file added" - dodavanje commit na students.csv
q10: git push - push na github
q11: git add Student.java, git commit -m "student class finished" - dodavanje Student.java + commit comment za istotot
q12-13-14: git checkout -b courseFeature - Dodavanje nova granka 
q16: done
q17: done
q18: git add students.csv, git commit -m "modified studetns.csv #4 changeda +2 new" - dodavanje students.csv i commit comment za istoto
q18.1: git add Course.java, git commit -m "new class for Course created" - dodavanje course java i commit za istoto.
q18.2: git push - push na github
q19: git checkout master, git merge courseFeature, git push - merge nad granka so master i push na master 


git log: 

PS D:\GitHub\SI_lab1_gr1_151532> git log
commit 778599c365217972987b78549eca43e241ca2ce1 (HEAD -> master, origin/master, origin/courseFeature, courseFeature)
Author: Кристијан Иваноски <zeroivanoski@gmail.com>
Date:   Sun Apr 12 22:59:08 2020 +0200

    new class for Course created

commit 1878385aeb50919e80cb56d35c5fdd6d3e886f11
Author: Кристијан Иваноски <zeroivanoski@gmail.com>
Date:   Sun Apr 12 22:58:53 2020 +0200

    modified studetns.csv #4 changeda +2 new

commit d7a210b6e88e5cd75ec9e2bd17f8d126c760a3cd
Author: Кристијан Иваноски <zeroivanoski@gmail.com>
Date:   Sun Apr 12 22:53:59 2020 +0200

    student class finished

commit a400008e1d4f54dec6188cc49c6be9dd15e4ad49
Author: Кристијан Иваноски <zeroivanoski@gmail.com>
Date:   Sun Apr 12 22:52:58 2020 +0200

    student class finished

commit 3f88ef0825d9ebbe16a953745548bf401e09f79e
Author: Кристијан Иваноски <zeroivanoski@gmail.com>
Date:   Sun Apr 12 22:40:57 2020 +0200

    students.csv file added

commit 5df40b171376206a267e925f09f54b722521edf5
Author: Кристијан Иваноски <zeroivanoski@gmail.com>
Date:   Sun Apr 12 22:21:06 2020 +0200

    first comment

commit 6f18e96cb4179baae3692013b3d210d5d716c9cc
Author: Stefan Andonov <stefan5andonov@yahoo.com>
Date:   Thu Mar 5 20:32:46 2020 +0100

    Initial commit



