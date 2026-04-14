# Supercomputer

## System Description
The astronomy department maintains a supercomputer that everyone wants to use.  Astronomers submit tasks to the supercomputer that consist of a series of datasets that must be processed independently.  Each task includes a name, priority, and an email address where the results should be sent.  Each dataset just has data.  Given a dataset, it is possible to compute an estimate of how long it will take to run.  The department agrees that the supercomputer should process datasets in priority order, and when priority is equal the supercomputer should select the dataset with the smallest estimate runtime.  However, it must be possible to change a task's priority after it has been submitted.

## Solution A
![Solution A UML Diagram](SupercomputerA.png)

[PlantUML link](https://www.plantuml.com/plantuml/img/bL3BJWCn3BpdAwoUMhJy0YTwf09jKSzcrmXhasmKEr8hr7_7-s9La92u98wT6S-CT1mJPWmWUl5aP-P6I_3EDHv5e2w9SjE7L9Jo4tA4JmVmWR7rz9pxXaGETDP7L1JIxUvxM9Utm7f4wROH0rMGClUPzL811MHVGJjXPCMy9kiPxVJn1sxdhhEcKv-xbqA5HYtbRn20_4l9EyVsrj5roM9erQJZLXjs1sERosNz_DmFl5OFn7RD-Ur5EPZMCQKqXNUpvdVOzm-hMxVwjlRcRhC8-W80)


## Solution B
![Solution B UML Diagram](SupercomputerB.png)

[PlantUML link](https://www.plantuml.com/plantuml/img/bL7BIiH04BpFLpHxsfNiBtXIRueInNERj3faNaptW8lilpkFnC0612-PK5rLKrt3atO18rfWEHdAtwW7ITOeDHXaXZu5YeEt8Gd5UzGElXN09xhHq6Fq0p4_q9VSe22Jx0-_mpwzMItFoDFUeQKEGjG-QZbrG1QrwM1i6burBo5ZsROHBtG7TPuplVeuFILALBEalqK0_AyaxzgDbnlD-z-oQ9llklDncSxAGWgjZStal5HP4jJ49KKLj1Zvj-POcSMZ9wdaufEF3seRLB_jenoFrsijQYqemxkhtMAe5kCC5xSjiQ0_)