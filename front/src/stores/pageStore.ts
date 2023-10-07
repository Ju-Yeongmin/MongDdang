import { create } from "zustand";

interface UsePageStoreProps {
  currentPage: string;
  actions: {
    setCurrentPage: (value: string) => void;
  };
}

const usePageStore = create<UsePageStoreProps>((set) => ({
  currentPage: "",
  actions: {
    setCurrentPage: (value: string) =>
      set((prev) => ({ ...prev, currentPage: value })),
  },
}));

export const usePageStoreState = () => usePageStore((state) => state);
export const usePageStoreActions = () => usePageStore((state) => state.actions);
