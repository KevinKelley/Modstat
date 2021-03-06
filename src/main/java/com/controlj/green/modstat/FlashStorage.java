/*
 * Copyright (c) 2011 Automated Logic Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.controlj.green.modstat;

public class FlashStorage {
    private long flashSize;
    private long totalFileSize;
    private long maxFileSize;
    private long usedFileSize;
    private long freeFileSize;
    private long archiveSize = Long.MIN_VALUE;

    public FlashStorage(long flashSize, long archiveSize, long totalFileSize, long maxFileSize, long usedFileSize, long freeFileSize) {
        this.flashSize = flashSize;
        this.archiveSize = archiveSize;
        this.totalFileSize = totalFileSize;
        this.maxFileSize = maxFileSize;
        this.usedFileSize = usedFileSize;
        this.freeFileSize = freeFileSize;
    }

    public boolean hasArchiveSize() {
        return archiveSize != Long.MIN_VALUE;
    }

    public long getArchiveSize() {
        return archiveSize;
    }

    public long getFlashSize() {
        return flashSize;
    }

    public long getTotalFileSize() {
        return totalFileSize;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public long getUsedFileSize() {
        return usedFileSize;
    }

    public long getFreeFileSize() {
        return freeFileSize;
    }
}
